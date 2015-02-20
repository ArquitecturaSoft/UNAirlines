package unairlines

class Airline {
    
    String name
    String phone
    String address
    
    static constrains = {
        name (blank:false)
        phone (blank:false, minSize:7)
        address (blank:false)
    }
    
}

