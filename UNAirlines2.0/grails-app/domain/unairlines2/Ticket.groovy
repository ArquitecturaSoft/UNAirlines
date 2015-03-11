package unairlines2

class Ticket {

    String code
    int seat
    String passengerName
    String passengerLastName
    String passengerID
    Date passengerBirthDate
    double price
    static belongsTo = [flight:Flight]
    
    static constrains = {
        code (unique:true, blank:false)
        seat (min:1, blank:false)
        passengerName (blank:false)
        passengerLastName (blank:false)
        passengerID (blank:false)
        passengerBirthDate (blank:false)
        
    }
    
    
}

