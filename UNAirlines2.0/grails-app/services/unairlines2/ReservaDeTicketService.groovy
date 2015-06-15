package unairlines2

import org.grails.cxf.utils.EndpointType
import java.util.*
import java.text.*

class ReservaDeTicketService {
    //static expose = EndpointType.JAX_WS
    static expose = ['cxf']
    static excludes = []

    Ticket[] serviceMethod(String vuelo,int seat, String passengerName, String passengerLastName,String passengerID,String passengerBirthDate,String email) 
    {
        //tmp = f.description +","+f.origin+","+f.destination+","+String.valueOf(f.cost)+","+fechaDconvertida+","+fechaAconvertida+","+String.valueOf(f.id)
        String[] camposVuelo = vuelo.split(",");
        Ticket reserva = new Ticket()
        
        reserva.code = camposVuelo[4].replace('-','')+"pt"+camposVuelo[6]
        reserva.seat = seat
        reserva.passengerName = passengerName
        reserva.passengerLastName = passengerLastName
        reserva.passengerID = passengerID
        Date fechaCumpleanos = null
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd")
        try{
            fechaCumpleanos = formatoDelTexto.parse(passengerBirthDate)
            reserva.passengerBirthDate = fechaCumpleanos
        }
        catch(ParseException ex){
            ex.printStackTrace()
        }
        
        reserva.price = Double.parseDouble(camposVuelo[3])
        reserva.save();
        def cliente = Customer.findByEmail(email)
        cliente.tickets.add(reserva)
        cliente.save()
        return  cliente.tickets
        //return "Compra de ticket exitosa\n"+reserva.code+" "+String.valueOf(reserva.seat)+" "+reserva.passengerName+" "+reserva.passengerLastName+" "+reserva.passengerID
    }
}
