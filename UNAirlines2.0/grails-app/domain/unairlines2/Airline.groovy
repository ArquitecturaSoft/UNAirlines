package unairlines2

class Airline implements Serializable{
    
    String name
    String phone
    String address
    static hasMany = [flights: Flight, flightClasses: FlightClass]
    
    
    static constrains = {
        name (blank:false)
        phone (blank:false, minSize:7)
        address (blank:false)
    }
    
}
