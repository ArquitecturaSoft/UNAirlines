package unairlines2


import unairlines2.FlightClass
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FlightController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    
    def doSearch() {
        
        def flightsListTemp = Flight.findAllByOriginAndDestination(
            params['originCity'], params['destinationCity'] )
        
        def flightsList = []
        def year = params['departureDate'].year
        def month = params['departureDate'].month
        def day = params['departureDate'].day
        
        for ( f in flightsListTemp ) {
            if ( f.departureDate.year == year )
                if ( f.departureDate.month == month )
                    if ( f.departureDate.day == day )
                        flightsList.add(f)
        }

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
        FlightClass cat
        for ( category in flightInstance.airline.flightClasses.asList() )
            if ( category.type == params['category'] ){
                multiplier = category.multiplier
                cat = category
            }
        render (view:"showFlight", model:[flightInstance: flightInstance, multiplier: multiplier, rCategory:cat])
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
