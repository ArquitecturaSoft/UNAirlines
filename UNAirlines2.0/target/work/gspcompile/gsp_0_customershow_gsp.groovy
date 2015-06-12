import unairlines2.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_customershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/show.gsp" }
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
invokeTag('set','g',22,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',23,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('render','g',28,['template':("/common/menu")],-1)
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'avatar3.png'))
printHtmlPart(8)
if(true && (customerInstance?.name)) {
printHtmlPart(9)
invokeTag('fieldValue','g',63,['bean':(customerInstance),'field':("name")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (customerInstance?.surname)) {
printHtmlPart(12)
invokeTag('fieldValue','g',70,['bean':(customerInstance),'field':("surname")],-1)
printHtmlPart(13)
}
printHtmlPart(11)
if(true && (customerInstance?.email)) {
printHtmlPart(14)
invokeTag('fieldValue','g',77,['bean':(customerInstance),'field':("email")],-1)
printHtmlPart(13)
}
printHtmlPart(11)
if(true && (customerInstance?.address)) {
printHtmlPart(15)
invokeTag('fieldValue','g',84,['bean':(customerInstance),'field':("address")],-1)
printHtmlPart(13)
}
printHtmlPart(11)
if(true && (customerInstance?.phone)) {
printHtmlPart(16)
invokeTag('fieldValue','g',91,['bean':(customerInstance),'field':("phone")],-1)
printHtmlPart(13)
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',96,['class':("edit"),'action':("edit"),'resource':(customerInstance)],3)
printHtmlPart(20)
})
invokeTag('form','g',98,['url':([resource:customerInstance, action:'edit'])],2)
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
public static final long LAST_MODIFIED = 1434079487709L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
