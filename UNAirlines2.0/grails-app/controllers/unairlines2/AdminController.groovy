package unairlines2



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AdminController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    def login = {
        
    }
    
    def doLogin = {
        
        def logged = Admin.findWhere(email:params['email'],password:params['password'])
      
        if (logged) 
        {
            session.user = logged
            session.isAdmin = true
            session.nickname = params['email']
            redirect(action:'show',id:logged.id)
        }
        else
            {
            flash.message="Error de credenciales"
            redirect(action:"login")
            }
    }
    
    def logout = {
		session.invalidate()
		redirect(uri:"/")
	}

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Admin.list(params), model:[adminInstanceCount: Admin.count()]
    }

    def show(Admin adminInstance) {
        respond adminInstance
    }

    def create() {
        respond new Admin(params)
    }

    @Transactional
    def save(Admin adminInstance) {
        if (adminInstance == null) {
            notFound()
            return
        }

        if (adminInstance.hasErrors()) {
            respond adminInstance.errors, view:'create'
            return
        }

        adminInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'admin.label', default: 'Admin'), adminInstance.id])
                redirect adminInstance
            }
            '*' { respond adminInstance, [status: CREATED] }
        }
    }

    def edit(Admin adminInstance) {
        respond adminInstance
    }

    @Transactional
    def update(Admin adminInstance) {
        if (adminInstance == null) {
            notFound()
            return
        }

        if (adminInstance.hasErrors()) {
            respond adminInstance.errors, view:'edit'
            return
        }

        adminInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Admin.label', default: 'Admin'), adminInstance.id])
                redirect adminInstance
            }
            '*'{ respond adminInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Admin adminInstance) {

        if (adminInstance == null) {
            notFound()
            return
        }

        adminInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Admin.label', default: 'Admin'), adminInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'admin.label', default: 'Admin'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
