package unairlines2

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TicketController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Ticket.list(params), model:[ticketInstanceCount: Ticket.count()]
    }

    def myTickets() {
        def customerInstance = Customer.findByEmail(session.nickname)
        render (view:"myTickets", model:[ticketInstanceList: customerInstance.tickets])
    }

    def show(Ticket ticketInstance) {
        respond ticketInstance
    }

    def create() {
        def flightInstance = Flight.findById(params['flightID'])
        def category = FlightClass.findById(params['categoryID'])
        def availableSeats = []
        def temp = []
        for ( int i = 1; i <= 60; i ++ )
            temp.add(i)
        def ticketList = flightInstance.tickets.asList()
        for ( x in ticketList ) {
            temp[x.seat - 1] = -1
        }
        for ( w in temp ) {
            if ( w > 0 ) {
                if ( category.type == "Economy" && w > 30 ) availableSeats.add(w);
                else if ( category.type == "Bussines" && w > 10 && w <= 30 ) availableSeats.add(w);
                else if ( category.type == "Bussines Premium" && w > 30 ) availableSeats.add(w);
            }
        }
        
        print flightInstance.cost
        double price = flightInstance.cost * category.multiplier
        String newCode = flightInstance.departureDate.getDateString().replace('/','')
        newCode = newCode + flightInstance.numberFlight.toString()
        
        respond new Ticket(params), model:[availableSeats: availableSeats, price: price, newCode: newCode, flightID:params['flightID']]
    }

    @Transactional
    def save(Ticket ticketInstance) {
        if (ticketInstance == null) {
            notFound()
            return
        }

        if (ticketInstance.hasErrors()) {
            respond ticketInstance.errors, view:'create'
            return
        }
        
        ticketInstance.code = ticketInstance.code + ticketInstance.seat.toString()
        ticketInstance.save flush:true
        def User = Customer.findByEmail(session.nickname)
        User.tickets.add(ticketInstance)
        User.save(flush:true)
        
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'ticket.label', default: 'Ticket'), ticketInstance.id])
                redirect ticketInstance
            }
            '*' { respond ticketInstance, [status: CREATED] }
        }
    }

    def edit(Ticket ticketInstance) {
        respond ticketInstance
    }

    @Transactional
    def update(Ticket ticketInstance) {        
        if (ticketInstance == null) {
            notFound()
            return
        }

        if (ticketInstance.hasErrors()) {
            respond ticketInstance.errors, view:'edit'
            return
        }

        ticketInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Ticket.label', default: 'Ticket'), ticketInstance.id])
                redirect ticketInstance
            }
            '*'{ respond ticketInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Ticket ticketInstance) {

        if (ticketInstance == null) {
            notFound()
            return
        }

        ticketInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Ticket.label', default: 'Ticket'), ticketInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'ticket.label', default: 'Ticket'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
