package unairlines2

class Flight implements Serializable{

    String numberFlight
    Date departureDate, arrivalDate
    String description
    String gate //door
    String origin
    String destination
    double cost
    static hasMany = [tickets: Ticket]
    static belongsTo = [airline: Airline]
    
    static constains = {
        numberFlight (blank:false)
        departureDate(blank:false)
        arrivalDate(blank:false)
        description(blank:false)
        gate (blank:false)
        origin (blank:false)
        destination (blank:false)
        cost(blank:false)
    }

}
