package unairlines

class Ticket {

    String code
    int seat
    String passengerName
    String passengerLastName
    String passengerID
    Date passengerBirthDate
    double price
    
    static constrains = {
        code (unique:true)
        seat (min:1)
        passengerName (blank:false)
        passengerLastName (blank:false)
        passengerID (blank:false)
    }
    
    
}

