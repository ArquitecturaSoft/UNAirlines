package unairlines2

import org.grails.cxf.utils.EndpointType
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import unairlines2.Flight

class ConsultarVuelosService {
    //static expose = EndpointType.JAX_WS
    static expose = ['cxf']
    static excludes = []
    String[] serviceMethod(String ciudadOrigen,String ciudadDestino,String fechaSalida) {
        def flightsListTemp = Flight.findAllByOriginAndDestination(
            ciudadOrigen,ciudadDestino)
        
        def flightsList = []
        
        String[] fechaStringBuscada = fechaSalida.split("-");

        
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd")

        String tmp; 
        
        for ( f in flightsListTemp ) {
       
            
            String fechaDconvertida = fecha.format(f.departureDate)

            String[] fechaString = fechaDconvertida.split("-");
     
            
            if ( fechaString[0].equals(fechaStringBuscada[0]) ) {
                if ( fechaString[1].equals(fechaStringBuscada[1]) ) {
                    if ( fechaString[2].equals(fechaStringBuscada[2]) ) {
                       
                        
                        String fechaAconvertida = fecha.format(f.arrivalDate)
                        tmp = f.description +","+f.origin+","+f.destination+","+String.valueOf(f.cost)+","+fechaDconvertida+","+fechaAconvertida+","+String.valueOf(f.id)
                        
                        flightsList.add(tmp)
                    }
                }
            }
        }

        
        return flightsList

    }
}
