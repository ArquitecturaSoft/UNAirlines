import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_airlinecreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/airline/create.gsp" }
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
invokeTag('set','g',17,['var':("entityName"),'value':(message(code: 'airline.label', default: 'Airline'))],-1)
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
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',22,['template':("/common/menuA")],-1)
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
invokeTag('eachError','g',33,['bean':(airlineInstance),'var':("error")],3)
printHtmlPart(14)
})
invokeTag('hasErrors','g',35,['bean':(airlineInstance)],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('render','g',42,['template':("form")],-1)
printHtmlPart(16)
expressionOut.print(message(code: 'default.button.create.label', default: 'Create'))
printHtmlPart(17)
})
invokeTag('form','g',57,['url':([resource:airlineInstance, action:'save'])],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138662L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
