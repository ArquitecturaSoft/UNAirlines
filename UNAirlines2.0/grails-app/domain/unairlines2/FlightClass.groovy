package unairlines2

class FlightClass {

    String type
    boolean wifi
    boolean individualTv
    boolean snacks
    boolean vipRoom
    boolean overWeightLuggage
    double multiplier
    static belongsTo = [airline: Airline]
    
    static constrains = {
        type(blank:false)
        multiplier (min:0,blank:false)
    }
}
