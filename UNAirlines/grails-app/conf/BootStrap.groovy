import unairlines.Admin

class BootStrap {

    def init = { servletContext ->
        def u = new Admin(name:"admin",surname:"admin",email:"admin@unal.edu.co",password:"12345")
            u.save();

    }
    def destroy = {
    }
}
