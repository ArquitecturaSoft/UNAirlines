import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flight/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',7,['src':("bootstrap.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',8,['src':("font-awesome.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',9,['src':("animate.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',10,['src':("prettyPhoto.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',12,['src':("responsive.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',13,['src':("table.css")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',14,['src':("jquery.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',15,['src':("bootstrap.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',16,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',17,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',18,['src':("main.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',19,['src':("wow.min.js")],-1)
printHtmlPart(4)
invokeTag('set','g',22,['var':("entityName"),'value':(message(code: 'flight.label', default: 'Flight'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',23,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',23,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',23,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',29,['template':("/common/menuA")],-1)
printHtmlPart(7)
loop:{
int i = 0
for( flightInstance in (flightInstanceList) ) {
printHtmlPart(8)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(9)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: flightInstance, field: "airline.name"))
})
invokeTag('link','g',50,['action':("show"),'id':(flightInstance.id)],3)
printHtmlPart(10)
invokeTag('formatDate','g',52,['date':(flightInstance.departureDate)],-1)
printHtmlPart(11)
invokeTag('formatDate','g',54,['date':(flightInstance.arrivalDate)],-1)
printHtmlPart(12)
expressionOut.print(fieldValue(bean: flightInstance, field: "origin"))
printHtmlPart(12)
expressionOut.print(fieldValue(bean: flightInstance, field: "destination"))
printHtmlPart(12)
expressionOut.print(fieldValue(bean: flightInstance, field: "cost"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: flightInstance, field: "description"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: flightInstance, field: "gate"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: flightInstance, field: "numberFlight"))
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('form','g',74,['controller':("flight"),'action':("create")],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',75,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487714L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
