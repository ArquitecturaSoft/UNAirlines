import unairlines2.Airline
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_airlineshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/airline/show.gsp" }
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
printHtmlPart(2)
invokeTag('set','g',19,['var':("entityName"),'value':(message(code: 'airline.label', default: 'Airline'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',20,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',20,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',24,['template':("/common/menuA")],-1)
printHtmlPart(5)
if(true && (airlineInstance?.address)) {
printHtmlPart(6)
invokeTag('fieldValue','g',39,['bean':(airlineInstance),'field':("address")],-1)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (airlineInstance?.flightClasses)) {
printHtmlPart(9)
for( f in (airlineInstance.flightClasses) ) {
printHtmlPart(10)
createTagBody(4, {->
expressionOut.print(f?.type)
})
invokeTag('link','g',46,['class':("cLink"),'controller':("flightClass"),'action':("show"),'id':(f.id)],4)
printHtmlPart(11)
}
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (airlineInstance?.flights)) {
printHtmlPart(12)
for( f in (airlineInstance.flights) ) {
printHtmlPart(10)
createTagBody(4, {->
expressionOut.print(f?.numberFlight)
printHtmlPart(13)
expressionOut.print(f?.origin)
printHtmlPart(14)
expressionOut.print(f?.destination)
})
invokeTag('link','g',54,['class':("cLink"),'controller':("flight"),'action':("show"),'id':(f.id)],4)
printHtmlPart(11)
}
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (airlineInstance?.name)) {
printHtmlPart(15)
invokeTag('fieldValue','g',61,['bean':(airlineInstance),'field':("name")],-1)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (airlineInstance?.phone)) {
printHtmlPart(16)
invokeTag('fieldValue','g',67,['bean':(airlineInstance),'field':("phone")],-1)
printHtmlPart(7)
}
printHtmlPart(17)
createClosureForHtmlPart(18, 2)
invokeTag('form','g',79,['action':("edit"),'resource':(airlineInstance)],2)
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
expressionOut.print(message(code: 'default.button.delete.confirm.message', default: 'Are you sure?'))
printHtmlPart(21)
})
invokeTag('form','g',84,['url':([resource:airlineInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138663L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
