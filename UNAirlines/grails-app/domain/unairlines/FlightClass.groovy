package unairlines

class FlightClass {

    String type
    boolean[] benefits
    double multiplier
    
    static constrains = {
        tipo (blank:false, inList:['Economy', 'Business', 'Business Premium'])
        multiplier (min:0)
    }
}

