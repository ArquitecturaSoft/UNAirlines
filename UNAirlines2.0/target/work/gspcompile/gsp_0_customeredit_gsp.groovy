import unairlines2.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_customeredit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('stylesheet','asset',5,['src':("bootstrap.min.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',6,['src':("font-awesome.min.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',7,['src':("animate.min.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("prettyPhoto.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',9,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',10,['src':("responsive.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',12,['src':("jquery.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',13,['src':("bootstrap.min.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',15,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("main.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',17,['src':("wow.min.js")],-1)
printHtmlPart(2)
invokeTag('set','g',19,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',20,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',20,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',20,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',24,['template':("/common/menu")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(9)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(10)
expressionOut.print(error.field)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('message','g',32,['error':(error)],-1)
printHtmlPart(13)
})
invokeTag('eachError','g',33,['bean':(customerInstance),'var':("error")],3)
printHtmlPart(14)
})
invokeTag('hasErrors','g',35,['bean':(customerInstance)],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('hiddenField','g',37,['name':("version"),'value':(customerInstance?.version)],-1)
printHtmlPart(16)
invokeTag('render','g',43,['template':("form")],-1)
printHtmlPart(17)
expressionOut.print(message(code: 'default.button.update.label', default: 'Update'))
printHtmlPart(18)
})
invokeTag('form','g',58,['url':([resource:customerInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1425835246900L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
