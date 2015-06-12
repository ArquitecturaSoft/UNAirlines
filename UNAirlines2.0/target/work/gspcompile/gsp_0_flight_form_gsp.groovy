import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flight_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flight/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('select','g',10,['id':("airline"),'name':("airline.id"),'from':(unairlines2.Airline.list()),'optionKey':("id"),'required':(""),'value':(flightInstance?.airline?.id),'optionValue':("name"),'class':("many-to-one")],-1)
printHtmlPart(1)
expressionOut.print(fieldValue(bean: flightInstance, field: 'cost'))
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("departureDate"),'precision':("minute"),'value':(flightInstance?.departureDate)],-1)
printHtmlPart(3)
invokeTag('datePicker','g',24,['name':("arrivalDate"),'precision':("minute"),'value':(flightInstance?.arrivalDate)],-1)
printHtmlPart(4)
expressionOut.print(flightInstance?.numberFlight)
printHtmlPart(5)
expressionOut.print(flightInstance?.origin)
printHtmlPart(6)
expressionOut.print(flightInstance?.destination)
printHtmlPart(7)
expressionOut.print(flightInstance?.gate)
printHtmlPart(8)
expressionOut.print(flightInstance?.description)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487712L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
