package unairlines

class Customer extends Person {
    
    String phone
    String address
    
    static constrains = {
        phone (blank:false)
        address (blank:false)
    }
    
}

