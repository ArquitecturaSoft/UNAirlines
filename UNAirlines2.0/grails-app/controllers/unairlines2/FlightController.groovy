package unairlines2



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FlightController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    
    def doSearch() {
        
        def flightsList = Flight.findAllByOriginAndDestinationAndDepartureDate(
            params['originCity'], params['destinationCity'], params['departureDate'] )

        render (view:"listSearch", model:[flightsList: flightsList])
    }
    
    def listSearch() {
    }

    def mainSearch() {
        def originCities = (Flight.where {}.projections { distinct 'origin' }).list()
        def destinationCities = (Flight.where {}.projections { distinct 'destination' }).list()
        render ( view:"mainSearch", model:[originCities: originCities, destinationCities: destinationCities])
    }
    
    def showFlight(Flight flightInstance) {
        double multiplier = 0.0
        for ( category in flightInstance.airline.flightClasses.asList() )
            if ( category.type == params['category'] )
                multiplier = category.multiplier
        render (view:"showFlight", model:[flightInstance: flightInstance, multiplier: multiplier])
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Flight.list(params), model:[flightInstanceCount: Flight.count()]
    }

    def show(Flight flightInstance) {
        respond flightInstance
    }

    def create() {
        respond new Flight(params)
    }

    @Transactional
    def save(Flight flightInstance) {
        if (flightInstance == null) {
            notFound()
            return
        }

        if (flightInstance.hasErrors()) {
            respond flightInstance.errors, view:'create'
            return
        }

        flightInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'flight.label', default: 'Flight'), flightInstance.id])
                redirect flightInstance
            }
            '*' { respond flightInstance, [status: CREATED] }
        }
    }

    def edit(Flight flightInstance) {
        respond flightInstance
    }

    @Transactional
    def update(Flight flightInstance) {
        if (flightInstance == null) {
            notFound()
            return
        }

        if (flightInstance.hasErrors()) {
            respond flightInstance.errors, view:'edit'
            return
        }

        flightInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Flight.label', default: 'Flight'), flightInstance.id])
                redirect flightInstance
            }
            '*'{ respond flightInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Flight flightInstance) {

        if (flightInstance == null) {
            notFound()
            return
        }

        flightInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Flight.label', default: 'Flight'), flightInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'flight.label', default: 'Flight'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
