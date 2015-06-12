import unairlines2.Ticket
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_ticket_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ticket/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('textField','g',10,['name':("code"),'required':(""),'value':(newCode),'readonly':("readonly")],-1)
printHtmlPart(1)
invokeTag('textField','g',14,['name':("flight.id"),'required':(""),'value':(flightID),'readonly':("readonly")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',18,['name':("passengerBirthDate"),'precision':("day"),'value':(ticketInstance?.passengerBirthDate)],-1)
printHtmlPart(3)
expressionOut.print(ticketInstance?.passengerID)
printHtmlPart(4)
expressionOut.print(ticketInstance?.passengerLastName)
printHtmlPart(5)
expressionOut.print(ticketInstance?.passengerName)
printHtmlPart(6)
invokeTag('field','g',34,['name':("price"),'value':((int)price),'required':(""),'readonly':("readonly")],-1)
printHtmlPart(7)
invokeTag('select','g',38,['name':("seat"),'from':(availableSeats)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138683L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
