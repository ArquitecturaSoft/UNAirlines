import unairlines2.Admin
import unFlight.*
import unairlines2.Flight

class BootStrap {

    def init = { servletContext ->
        def u = new Admin(name:"admin",surname:"admin",email:"admin@unal.edu.co",password:"12345")
            u.save();
        new Flight(numberFlight:"QAZ123",
            departureDate:new Date().parse('yyyy/MM/dd', '2015/02/25'),
            arrivalDate:new Date().parse('yyyy/MM/dd', '2015/02/25'),
            description:"Vuelo de prueba 1", gate:"11", origin:"Bogota",
            destination:"Medellin", cost:90000).save()
        new Flight(numberFlight:"QAZ124", departureDate:new Date(),
            arrivalDate:new Date().parse('yyyy/MM/dd', '2015/02/25'),
            description:"Vuelo de prueba 2", gate:"11", origin:"Bogota",
            destination:"Manizales", cost:150000).save()
        new Flight(numberFlight:"QAZ125", departureDate:new Date(),
            arrivalDate:new Date().parse('yyyy/MM/dd', '2015/02/25'),
            description:"Vuelo de prueba 3", gate:"11", origin:"Cartagena",
            destination:"Bogota", cost:120000).save()
        new Flight(numberFlight:"QAZ126", departureDate:new Date(),
            arrivalDate:new Date().parse('yyyy/MM/dd', '2015/02/25'),
            description:"Vuelo de prueba 4", gate:"11", origin:"Leticia",
            destination:"Armenia", cost:200000).save() 
       
    }
    def destroy = {
        
    }
}
