import unairlines2.FlightClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightClassindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flightClass/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',8,['src':("bootstrap.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',9,['src':("font-awesome.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',10,['src':("animate.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',11,['src':("prettyPhoto.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',12,['src':("main.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',13,['src':("responsive.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',14,['src':("table.css")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',15,['src':("jquery.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',16,['src':("bootstrap.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',17,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',18,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',19,['src':("main.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',20,['src':("wow.min.js")],-1)
printHtmlPart(2)
invokeTag('set','g',21,['var':("entityName"),'value':(message(code: 'flightClass.label', default: 'FlightClass'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',22,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',22,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',22,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',23,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',26,['template':("/common/menuA")],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
loop:{
int i = 0
for( flightClassInstance in (flightClassInstanceList) ) {
printHtmlPart(10)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: flightClassInstance, field: "airline.name"))
})
invokeTag('link','g',54,['action':("show"),'id':(flightClassInstance.id)],3)
printHtmlPart(12)
invokeTag('checkBox','g',56,['name':("iTv"),'value':(flightClassInstance.individualTv),'disabled':("true")],-1)
printHtmlPart(13)
invokeTag('checkBox','g',58,['name':("owl"),'value':(flightClassInstance.overWeightLuggage),'disabled':("true")],-1)
printHtmlPart(14)
invokeTag('checkBox','g',60,['name':("snk"),'value':(flightClassInstance.snacks),'disabled':("true")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',62,['name':("vip"),'value':(flightClassInstance.vipRoom),'disabled':("true")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',64,['name':("wifi"),'value':(flightClassInstance.wifi),'disabled':("true")],-1)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: flightClassInstance, field: "type"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: flightClassInstance, field: "multiplier"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('form','g',80,['controller':("flightClass"),'action':("create")],2)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',83,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138677L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
