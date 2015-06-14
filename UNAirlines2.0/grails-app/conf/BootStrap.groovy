import unairlines2.Admin
import unairlines2.Customer
import unFlight.*
import unairlines2.Flight

class BootStrap {

    def init = { servletContext ->
        def u = new Admin(name:"admin",surname:"admin",email:"admin@unal.edu.co",password:"12345")
            u.save();
        def u2 = new Admin(name:"admin2",surname:"admin2",email:"admin2@unal.edu.co",password:"12345")
            u2.save();
        def u3 = new Admin(name:"admin3",surname:"admin3",email:"admin3@unal.edu.co",password:"12345")
            u3.save();
        def m = new Customer(name:"user",surname:"user",email:"user@unal.edu.co",password:"12345",phone:"1234567",address:"Cra 45 # 56-54")
            m.save();
        
       
    }
    def destroy = {
        
    }
}
