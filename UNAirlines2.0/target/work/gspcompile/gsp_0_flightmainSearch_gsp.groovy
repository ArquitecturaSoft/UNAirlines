import unairlines2.Flight
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightmainSearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flight/mainSearch.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
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
printHtmlPart(2)
invokeTag('javascript','asset',12,['src':("jquery.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',13,['src':("bootstrap.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',14,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',15,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',16,['src':("main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',17,['src':("wow.min.js")],-1)
printHtmlPart(2)
invokeTag('set','g',18,['var':("entityName"),'value':(message(code: 'flight.label', default: 'Flight'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',19,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',19,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',23,['template':("/common/menu")],-1)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('select','g',38,['name':("originCity"),'value':("originCity"),'from':(originCities)],-1)
printHtmlPart(8)
invokeTag('select','g',41,['name':("destinationCity"),'value':("destinationCity"),'from':(destinationCities)],-1)
printHtmlPart(9)
invokeTag('datePicker','g',44,['name':("departureDate"),'value':(new Date()),'precision':("day"),'years':((1900 + new Date().year)..(1900 + new Date().year + 1))],-1)
printHtmlPart(10)
})
invokeTag('form','g',48,['class':("simpleform"),'url':([controller:'Flight', action:'doSearch'])],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487728L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
