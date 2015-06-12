package unairlines2

class Customer extends Person implements Serializable{
    
    String phone
    String address
    static hasMany = [tickets: Ticket]
    
    static constrains = {
        phone (blank:false,minSize:7)
        address (blank:false)
    }
    
}
