package unairlines2



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PersonController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    
    def login = {
    }
    
    def doLogin = {
        def user = Person.findWhere(email:params['email'], password:params['password'])
	
	if (user) {
            
            if (loginLDAP(params['email'],params['password'])) {

                session.user = user
                session.nickname = params['email']

                if (user.class == Customer.class) {
                    session.isCustomer = true
                    flash.message = user.name
                    redirect(controller:'Customer', action:'show' , id: user.id)
                }
                if (user.class == Admin.class)
                {
                    flash.message = "Esta cuenta es de administrador"
                    session.invalidate()
                    redirect(url:"/admin/login")
                }
            }
            else {
                flash.message = "E-mail o clave inexistente en LDAP"
                redirect(action:"login") 
            }
        }    
        else {
            flash.message = "E-mail o clave incorrecta o no existe usuario"
            redirect(action:"login")
        }
    }
    
    def loginLDAP(String usuario, String pass) {
        print(usuario)
        print(pass)
        Login login = new Login()
        String mensaje = login.login(usuario, pass)
        if ( mensaje.equals("Login exitoso"))
            return true
        return false
       
    }
    
    def logout = {
		session.invalidate()
		redirect(url:"/")
	}

    
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Person.list(params), model:[personInstanceCount: Person.count()]
    }

    def show(Person personInstance) {
        respond personInstance
    }

    def create() {
        respond new Person(params)
    }

    @Transactional
    def save(Person personInstance) {
        if (personInstance == null) {
            notFound()
            return
        }

        if (personInstance.hasErrors()) {
            respond personInstance.errors, view:'create'
            return
        }

        personInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'person.label', default: 'Person'), personInstance.id])
                redirect personInstance
            }
            '*' { respond personInstance, [status: CREATED] }
        }
    }

    def edit(Person personInstance) {
        respond personInstance
    }

    @Transactional
    def update(Person personInstance) {
        if (personInstance == null) {
            notFound()
            return
        }

        if (personInstance.hasErrors()) {
            respond personInstance.errors, view:'edit'
            return
        }

        personInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Person.label', default: 'Person'), personInstance.id])
                redirect personInstance
            }
            '*'{ respond personInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Person personInstance) {

        if (personInstance == null) {
            notFound()
            return
        }

        personInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Person.label', default: 'Person'), personInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'person.label', default: 'Person'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
