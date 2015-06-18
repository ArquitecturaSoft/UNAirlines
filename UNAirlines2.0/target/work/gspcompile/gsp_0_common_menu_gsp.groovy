import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_common_menu_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/common/_menu.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(1)
createClosureForHtmlPart(2, 1)
invokeTag('form','g',18,['controller':("Customer"),'action':("show")],1)
printHtmlPart(3)
createClosureForHtmlPart(4, 1)
invokeTag('form','g',21,['controller':("Ticket"),'action':("myTickets")],1)
printHtmlPart(5)
createClosureForHtmlPart(6, 1)
invokeTag('form','g',26,['controller':("Flight"),'action':("mainSearch")],1)
printHtmlPart(7)
createClosureForHtmlPart(8, 1)
invokeTag('form','g',31,['controller':("Airline"),'action':("index")],1)
printHtmlPart(9)
createClosureForHtmlPart(10, 1)
invokeTag('form','g',36,['controller':("Person"),'action':("logout")],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1428730175320L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
