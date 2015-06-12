import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightlistSearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flight/listSearch.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',7,['src':("bootstrap.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',8,['src':("font-awesome.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['src':("animate.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("prettyPhoto.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',12,['src':("responsive.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',13,['src':("table.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',14,['src':("jquery.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',15,['src':("bootstrap.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',16,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',17,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',18,['src':("main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',19,['src':("wow.min.js")],-1)
printHtmlPart(3)
invokeTag('set','g',20,['var':("entityName"),'value':(message(code: 'flight.label', default: 'Flight'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',21,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',21,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',21,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',25,['template':("/common/menu")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( flightInstance in (flightsList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
invokeTag('formatDate','g',46,['date':(flightInstance.departureDate)],-1)
printHtmlPart(9)
invokeTag('formatDate','g',48,['date':(flightInstance.arrivalDate)],-1)
printHtmlPart(10)
expressionOut.print(fieldValue(bean: flightInstance, field: "origin"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: flightInstance, field: "destination"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: flightInstance, field: "description"))
printHtmlPart(11)
invokeTag('set','g',57,['var':("flag"),'value':("true")],-1)
printHtmlPart(12)
loop:{
int j = 0
for( categoryInstance in (flightInstance.airline.flightClasses.asList()) ) {
printHtmlPart(13)
if(true && (categoryInstance.type == "Economy")) {
printHtmlPart(14)
createTagBody(5, {->
printHtmlPart(15)
expressionOut.print((long)(flightInstance.cost * categoryInstance.multiplier))
printHtmlPart(16)
})
invokeTag('link','g',63,['action':("showFlight"),'id':(flightInstance.id),'params':([category: 'Economy'])],5)
printHtmlPart(17)
invokeTag('set','g',65,['var':("flag"),'value':("false")],-1)
printHtmlPart(13)
}
printHtmlPart(12)
j++
}
}
printHtmlPart(12)
if(true && (flag == 'true')) {
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('set','g',72,['var':("flag"),'value':("true")],-1)
printHtmlPart(12)
loop:{
int j = 0
for( categoryInstance in (flightInstance.airline.flightClasses.asList()) ) {
printHtmlPart(13)
if(true && (categoryInstance.type == "Bussines")) {
printHtmlPart(14)
createTagBody(5, {->
printHtmlPart(15)
expressionOut.print(flightInstance.cost * categoryInstance.multiplier)
printHtmlPart(16)
})
invokeTag('link','g',78,['action':("showFlight"),'id':(flightInstance.id),'params':([category: 'Bussines'])],5)
printHtmlPart(17)
invokeTag('set','g',80,['var':("flag"),'value':("false")],-1)
printHtmlPart(13)
}
printHtmlPart(12)
j++
}
}
printHtmlPart(12)
if(true && (flag == 'true')) {
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('set','g',87,['var':("flag"),'value':("true")],-1)
printHtmlPart(12)
loop:{
int j = 0
for( categoryInstance in (flightInstance.airline.flightClasses.asList()) ) {
printHtmlPart(13)
if(true && (categoryInstance.type == "Bussines Premium")) {
printHtmlPart(14)
createTagBody(5, {->
printHtmlPart(15)
expressionOut.print(flightInstance.cost * categoryInstance.multiplier)
printHtmlPart(16)
})
invokeTag('link','g',93,['action':("showFlight"),'id':(flightInstance.id),'params':([category: 'Bussines Premium'])],5)
printHtmlPart(17)
invokeTag('set','g',95,['var':("flag"),'value':("false")],-1)
printHtmlPart(13)
}
printHtmlPart(12)
j++
}
}
printHtmlPart(12)
if(true && (flag == 'true')) {
printHtmlPart(18)
}
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487715L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
