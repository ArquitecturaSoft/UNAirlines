package unairlines2

import grails.transaction.Transactional

@Transactional
class TicketService {
    static expose = ['cxf']
    String createTicket(String code, int seat, String passengerName, String passengerLastName, String passengerID, Date passengerBirthDate, double price){
        
        Ticket t = new Ticket();
        
        t.code = code
        t.seat = seat
        t.passengerName = passengerName
        t.passengerLastName = passengerLastName
        t.passengerID = passengerID
        t.passengerBirthDate = passengerBirthDate
        t.price = price      
        
        return "Ola ke ase"
    }
    
    
    def serviceMethod() {

    }
}
