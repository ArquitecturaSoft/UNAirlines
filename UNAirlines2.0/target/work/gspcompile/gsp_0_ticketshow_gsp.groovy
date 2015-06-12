import unairlines2.Ticket
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_ticketshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ticket/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('stylesheet','asset',6,['src':("bootstrap.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',7,['src':("font-awesome.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',8,['src':("animate.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',9,['src':("prettyPhoto.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',10,['src':("main.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',11,['src':("responsive.css")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',13,['src':("jquery.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',14,['src':("bootstrap.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',15,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',16,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',17,['src':("main.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',18,['src':("wow.min.js")],-1)
printHtmlPart(2)
invokeTag('set','g',19,['var':("entityName"),'value':(message(code: 'ticket.label', default: 'Ticket'))],-1)
printHtmlPart(2)
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
invokeTag('render','g',24,['template':("/common/menu")],-1)
printHtmlPart(7)
if(true && (ticketInstance?.code)) {
printHtmlPart(8)
invokeTag('fieldValue','g',39,['bean':(ticketInstance),'field':("code")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (ticketInstance?.flight)) {
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(ticketInstance?.flight?.origin)
printHtmlPart(12)
expressionOut.print(ticketInstance?.flight?.destination)
})
invokeTag('link','g',45,['controller':("flight"),'action':("show"),'id':(ticketInstance?.flight?.id)],3)
printHtmlPart(9)
}
printHtmlPart(13)
if(true && (ticketInstance?.passengerBirthDate)) {
printHtmlPart(14)
invokeTag('formatDate','g',51,['date':(ticketInstance?.passengerBirthDate),'format':("yyyy-mm-dd")],-1)
printHtmlPart(9)
}
printHtmlPart(13)
if(true && (ticketInstance?.passengerID)) {
printHtmlPart(15)
invokeTag('fieldValue','g',57,['bean':(ticketInstance),'field':("passengerID")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (ticketInstance?.passengerLastName)) {
printHtmlPart(16)
invokeTag('fieldValue','g',63,['bean':(ticketInstance),'field':("passengerLastName")],-1)
printHtmlPart(9)
}
printHtmlPart(13)
if(true && (ticketInstance?.passengerName)) {
printHtmlPart(17)
invokeTag('fieldValue','g',69,['bean':(ticketInstance),'field':("passengerName")],-1)
printHtmlPart(9)
}
printHtmlPart(13)
if(true && (ticketInstance?.price)) {
printHtmlPart(18)
invokeTag('fieldValue','g',75,['bean':(ticketInstance),'field':("price")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (ticketInstance?.seat)) {
printHtmlPart(19)
invokeTag('fieldValue','g',81,['bean':(ticketInstance),'field':("seat")],-1)
printHtmlPart(9)
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487797L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
