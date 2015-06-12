import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flight/show.gsp" }
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
invokeTag('set','g',19,['var':("entityName"),'value':(message(code: 'flight.label', default: 'Flight'))],-1)
printHtmlPart(4)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',20,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',20,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',24,['template':("/common/menuA")],-1)
printHtmlPart(7)
if(true && (flightInstance?.airline)) {
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(flightInstance?.airline?.name)
})
invokeTag('link','g',39,['class':("cLink"),'controller':("airline"),'action':("show"),'id':(flightInstance?.airline?.id)],3)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (flightInstance?.numberFlight)) {
printHtmlPart(11)
invokeTag('fieldValue','g',45,['bean':(flightInstance),'field':("numberFlight")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flightInstance?.origin)) {
printHtmlPart(14)
invokeTag('fieldValue','g',51,['bean':(flightInstance),'field':("origin")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flightInstance?.destination)) {
printHtmlPart(15)
invokeTag('fieldValue','g',57,['bean':(flightInstance),'field':("destination")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flightInstance?.departureDate)) {
printHtmlPart(16)
invokeTag('formatDate','g',63,['date':(flightInstance?.departureDate),'format':("yyyy-mm-dd")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flightInstance?.arrivalDate)) {
printHtmlPart(17)
invokeTag('formatDate','g',69,['date':(flightInstance?.arrivalDate),'format':("yyyy-mm-dd")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flightInstance?.gate)) {
printHtmlPart(18)
invokeTag('fieldValue','g',75,['bean':(flightInstance),'field':("gate")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flightInstance?.description)) {
printHtmlPart(19)
invokeTag('fieldValue','g',81,['bean':(flightInstance),'field':("description")],-1)
printHtmlPart(12)
}
printHtmlPart(20)
if(true && (flightInstance?.cost)) {
printHtmlPart(21)
invokeTag('fieldValue','g',87,['bean':(flightInstance),'field':("cost")],-1)
printHtmlPart(12)
}
printHtmlPart(22)
createClosureForHtmlPart(23, 2)
invokeTag('form','g',99,['action':("edit"),'resource':(flightInstance)],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
expressionOut.print(message(code: 'default.button.delete.confirm.message', default: 'Are you sure?'))
printHtmlPart(26)
})
invokeTag('form','g',104,['url':([resource:flightInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',117,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138674L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
