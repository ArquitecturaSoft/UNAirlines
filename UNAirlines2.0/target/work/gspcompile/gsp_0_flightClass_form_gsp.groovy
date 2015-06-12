import unairlines2.FlightClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightClass_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flightClass/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('select','g',11,['id':("airline"),'name':("airline.id"),'from':(unairlines2.Airline.list()),'optionKey':("id"),'required':(""),'value':(flightClassInstance?.airline?.id),'class':("many-to-one"),'optionValue':("name")],-1)
printHtmlPart(1)
invokeTag('checkBox','g',15,['name':("individualTv"),'value':(flightClassInstance?.individualTv)],-1)
printHtmlPart(2)
invokeTag('checkBox','g',19,['name':("overWeightLuggage"),'value':(flightClassInstance?.overWeightLuggage)],-1)
printHtmlPart(3)
invokeTag('checkBox','g',23,['name':("snacks"),'value':(flightClassInstance?.snacks)],-1)
printHtmlPart(4)
invokeTag('checkBox','g',29,['name':("vipRoom"),'value':(flightClassInstance?.vipRoom)],-1)
printHtmlPart(5)
invokeTag('checkBox','g',34,['name':("wifi"),'value':(flightClassInstance?.wifi)],-1)
printHtmlPart(6)
invokeTag('select','g',38,['name':("type"),'from':(["Economy", "Bussines", "Bussines Premium"]),'value':(flightClassInstance?.type),'required':("")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: flightClassInstance, field: 'multiplier'))
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487777L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
