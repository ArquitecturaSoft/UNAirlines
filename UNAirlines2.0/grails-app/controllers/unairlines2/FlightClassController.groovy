package unairlines2



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FlightClassController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond FlightClass.list(params), model:[flightClassInstanceCount: FlightClass.count()]
    }

    def show(FlightClass flightClassInstance) {
        respond flightClassInstance
    }

    def create() {
        respond new FlightClass(params)
    }

    @Transactional
    def save(FlightClass flightClassInstance) {
        if (flightClassInstance == null) {
            notFound()
            return
        }

        if (flightClassInstance.hasErrors()) {
            respond flightClassInstance.errors, view:'create'
            return
        }

        flightClassInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'flightClass.label', default: 'FlightClass'), flightClassInstance.id])
                redirect flightClassInstance
            }
            '*' { respond flightClassInstance, [status: CREATED] }
        }
    }

    def edit(FlightClass flightClassInstance) {
        respond flightClassInstance
    }

    @Transactional
    def update(FlightClass flightClassInstance) {
        if (flightClassInstance == null) {
            notFound()
            return
        }

        if (flightClassInstance.hasErrors()) {
            respond flightClassInstance.errors, view:'edit'
            return
        }

        flightClassInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'FlightClass.label', default: 'FlightClass'), flightClassInstance.id])
                redirect flightClassInstance
            }
            '*'{ respond flightClassInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(FlightClass flightClassInstance) {

        if (flightClassInstance == null) {
            notFound()
            return
        }

        flightClassInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'FlightClass.label', default: 'FlightClass'), flightClassInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'flightClass.label', default: 'FlightClass'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
