package unairlines2

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.grails.plugins.wsclient.service.WebService

class ConsumingServiceController {
    WebService webService
    WebService webService2
    def index = {
        /*def wsdlUrl = "http://localhost:8080/UNAirlines2.0/services/consultarVuelos?wsdl"
        def proxy = webService.getClient(wsdlUrl)
        String[] resul = proxy.serviceMethod("BOGOTA","CARTAGENA","2015-03-18") 
        println(resul)*/
        def wsdlUrl2 = "http://localhost:8080/UNAirlines2.0/services/reservaDeTicket?wsdl"
        def proxy2 = webService.getClient(wsdlUrl2)
        Ticket[] resul2 = proxy2.serviceMethod("VUELO BOGOTA-MEDELLIN,BOGOTA,MEDELLIN,200000.0,2015-03-18,2015-03-18,1",3,"Juan","Mendez","12345678","2015-08-08","ceparadac@unal.edu.co") 
        println(resul2.toString())
    }
}
