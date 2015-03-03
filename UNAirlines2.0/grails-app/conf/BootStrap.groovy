import unairlines2.Admin
import unairlines2.Customer
import unFlight.*
import unairlines2.Flight

class BootStrap {

    def init = { servletContext ->
        def u = new Admin(name:"admin",surname:"admin",email:"admin@unal.edu.co",password:"12345")
            u.save();
        def m = new Customer(name:"user",surname:"user",email:"user@unal.edu.co",password:"12345",phone:"1234567",address:"Cra 45 # 56-54")
            m.save();
        
       
    }
    def destroy = {
        
    }
}
