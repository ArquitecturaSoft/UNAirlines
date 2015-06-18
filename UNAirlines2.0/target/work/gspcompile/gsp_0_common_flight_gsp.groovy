import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_common_flight_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/common/_flight.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('stylesheet','asset',6,['src':("bootstrap.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',7,['src':("font-awesome.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',8,['src':("animate.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['src':("prettyPhoto.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',11,['src':("responsive.css")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',13,['src':("jquery.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',14,['src':("bootstrap.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',15,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',16,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',17,['src':("main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',18,['src':("wow.min.js")],-1)
printHtmlPart(4)
invokeTag('set','g',21,['var':("entityName"),'value':(message(code: 'flight.label', default: 'Flight'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',22,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',22,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',22,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',23,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',31,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',39,['property':("arrivalDate"),'title':(message(code: 'flight.arrivalDate.label', default: 'Arrival Date'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',41,['property':("departureDate"),'title':(message(code: 'flight.departureDate.label', default: 'Departure Date'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',43,['property':("destination"),'title':(message(code: 'flight.destination.label', default: 'Destination'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',45,['property':("cost"),'title':(message(code: 'flight.cost.label', default: 'Cost'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',47,['property':("gate"),'title':(message(code: 'flight.gate.label', default: 'Gate'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',49,['property':("description"),'title':(message(code: 'flight.description.label', default: 'Description'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( flightInstance in (flightInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: flightInstance, field: "arrivalDate"))
})
invokeTag('link','g',57,['action':("show"),'id':(flightInstance.id)],3)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: flightInstance, field: "cost"))
printHtmlPart(15)
invokeTag('formatDate','g',61,['date':(flightInstance.departureDate)],-1)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: flightInstance, field: "description"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: flightInstance, field: "destination"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: flightInstance, field: "gate"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',74,['total':(flightInstanceCount ?: 0)],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',86,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434593872015L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
