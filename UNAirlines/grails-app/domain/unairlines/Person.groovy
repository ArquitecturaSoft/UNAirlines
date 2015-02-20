package unairlines

class Person {

    String name
    String surname
    String email
    String password
    
    static constraints = {
        name (blank:false)
        surname (blank:false)
        email (unique:true, email:true)
        password (blank:false, password:true)
    }
    
}

