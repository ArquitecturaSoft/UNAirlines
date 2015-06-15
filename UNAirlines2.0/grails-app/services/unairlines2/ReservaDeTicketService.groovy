package unairlines2

import org.grails.cxf.utils.EndpointType
import java.util.*
import java.text.*

class ReservaDeTicketService {
    //static expose = EndpointType.JAX_WS
    static expose = ['cxf']
    static excludes = []

    String serviceMethod(String vuelo,int seat, String passengerName, String passengerLastName,String passengerID,String passengerBirthDate,String email) 
    {
        //tmp = f.description +","+f.origin+","+f.destination+","+String.valueOf(f.cost)+","+fechaDconvertida+","+fechaAconvertida+","+String.valueOf(f.id)
        String[] camposVuelo = vuelo.split(",");
        Ticket reserva = new Ticket()
        reserva.code = camposVuelo[4].replace('-','')+"pt"+camposVuelo[6]
        reserva.seat = seat
        reserva.passengerName = passengerName
        reserva.passengerLastName = passengerLastName
        reserva.passengerID = passengerID
        Date fechaCumpleanos
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd")
        try{
            fechaCumpleanos = formatoDelTexto.parse(passengerBirthDate)
            reserva.passengerBirthDate = fechaCumpleanos
        }
        catch(ParseException ex){
            ex.printStackTrace()
        }
        
        reserva.price = Double.parseDouble(camposVuelo[3])
        reserva.flight = Flight.findById(Integer.parseInt(camposVuelo[6]))
        reserva.save(flush:true,failOnError:true)
        def cliente = Customer.findByEmail(email)
        //cliente.tickets.add(new Ticket(code:camposVuelo[4].replace('-','')+"pt"+camposVuelo[6],seat:seat,passengerName:passengerName,passengerLastName:passengerLastName,passengerID:passengerID,passengerBirthDate:null,price:Double.parseDouble(camposVuelo[3])))
        cliente.tickets.add(reserva)
        cliente.save(failOnError:true) 
        //Ticket ttt = new Ticket(code:camposVuelo[4].replace('-','')+"pt"+camposVuelo[6],seat:seat,passengerName:passengerName,passengerLastName:passengerLastName,passengerID:passengerID,passengerBirthDate:null,price:Double.parseDouble(camposVuelo[3]),)
        //return cliente.tickets.find()
        //return reserva
        return "Compra de ticket exitosa\n"+reserva.code+" "+String.valueOf(reserva.seat)+" "+reserva.passengerName+" "+reserva.passengerLastName+" "+reserva.passengerID
    }
}
