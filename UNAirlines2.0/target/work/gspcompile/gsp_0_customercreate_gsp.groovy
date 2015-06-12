import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_customercreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',5,['src':("bootstrap.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',6,['src':("font-awesome.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',7,['src':("animate.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',8,['src':("prettyPhoto.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['src':("main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("responsive.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',11,['src':("jquery.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',12,['src':("bootstrap.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',13,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',14,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',15,['src':("main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',16,['src':("wow.min.js")],-1)
printHtmlPart(2)
invokeTag('set','g',17,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',18,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',18,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',18,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',19,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('form','g',42,['controller':("Customer"),'action':("create"),'method':("post")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('form','g',47,['controller':("Person"),'action':("login"),'method':("post")],2)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(15)
expressionOut.print(error.field)
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('message','g',66,['error':(error)],-1)
printHtmlPart(18)
})
invokeTag('eachError','g',67,['bean':(customerInstance),'var':("error")],3)
printHtmlPart(19)
})
invokeTag('hasErrors','g',69,['bean':(customerInstance)],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('render','g',76,['template':("form")],-1)
printHtmlPart(21)
expressionOut.print(message(code: 'default.button.create.label', default: 'Create'))
printHtmlPart(22)
})
invokeTag('form','g',90,['url':([resource:customerInstance, action:'save'])],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',92,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138666L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
