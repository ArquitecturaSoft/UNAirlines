package unairlines2

import org.grails.cxf.utils.EndpointType
import java.util.*

class ReservaDeTicketService {
    //static expose = EndpointType.JAX_WS
    static expose = ['cxf']
    static excludes = []

    String serviceMethod(String code, int seat, String passengerName, String passengerLastName,String passengerID,Date passengerBirthDate, double price) 
    {
        Ticket reserva = new Ticket();
        
        reserva.code = code
        reserva.seat = seat
        reserva.passengerName = passengerName
        reserva.passengerLastName = passengerLastName
        reserva.passengerID = passengerID
        reserva.passengerBirthDate = passengerBirthDate
        reserva.price = price    
 
        return "Compra de ticket exitosa\n"+reseva.code+" "+String.valueOf(reseva.seat)+" "+reseva.passengerName+" "+reseva.passengerLastName+" "+reseva.passengerID+" "+String.valueOf(reseva.price)
    }
}
