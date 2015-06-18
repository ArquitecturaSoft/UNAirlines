import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightshowFlight_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flight/showFlight.gsp" }
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
printHtmlPart(3)
invokeTag('set','g',20,['var':("entityName"),'value':(message(code: 'flight.label', default: 'Flight'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',21,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',21,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',21,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',25,['template':("/common/menu")],-1)
printHtmlPart(5)
if(true && (flightInstance?.airline)) {
printHtmlPart(6)
expressionOut.print(flightInstance?.airline?.name)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print((long)(flightInstance.cost * multiplier))
printHtmlPart(9)
invokeTag('formatDate','g',42,['date':(flightInstance?.departureDate)],-1)
printHtmlPart(10)
invokeTag('formatDate','g',43,['date':(flightInstance?.arrivalDate)],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',44,['bean':(flightInstance),'field':("description")],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',45,['bean':(flightInstance),'field':("origin")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',46,['bean':(flightInstance),'field':("destination")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',47,['bean':(flightInstance),'field':("gate")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',48,['bean':(flightInstance),'field':("numberFlight")],-1)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('hiddenField','g',52,['name':("flightID"),'value':(flightInstance.id)],-1)
printHtmlPart(7)
invokeTag('hiddenField','g',53,['name':("categoryID"),'value':(rCategory.id)],-1)
printHtmlPart(17)
})
invokeTag('form','g',57,['controller':("ticket"),'action':("create")],2)
printHtmlPart(18)
expressionOut.print(rCategory.type)
printHtmlPart(19)
invokeTag('checkBox','g',68,['name':("wifi"),'value':(rCategory.wifi),'disabled':("true")],-1)
printHtmlPart(20)
invokeTag('checkBox','g',69,['name':("IndividualTv"),'value':(rCategory.individualTv),'disabled':("true")],-1)
printHtmlPart(21)
invokeTag('checkBox','g',70,['name':("snacks"),'value':(rCategory.snacks),'disabled':("true")],-1)
printHtmlPart(22)
invokeTag('checkBox','g',71,['name':("vipRoom"),'value':(rCategory.vipRoom),'disabled':("true")],-1)
printHtmlPart(23)
invokeTag('checkBox','g',72,['name':("verWeightLuggage"),'value':(rCategory.overWeightLuggage),'disabled':("true")],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',81,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1428730175330L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
