import unairlines2.FlightClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightClassedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flightClass/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
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
printHtmlPart(3)
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
printHtmlPart(1)
invokeTag('set','g',18,['var':("entityName"),'value':(message(code: 'flightClass.label', default: 'FlightClass'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',19,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',19,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',19,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',23,['template':("/common/menuA")],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(12)
expressionOut.print(error.field)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('message','g',31,['error':(error)],-1)
printHtmlPart(15)
})
invokeTag('eachError','g',32,['bean':(flightClassInstance),'var':("error")],3)
printHtmlPart(16)
})
invokeTag('hasErrors','g',34,['bean':(flightClassInstance)],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(17)
invokeTag('hiddenField','g',36,['name':("version"),'value':(flightClassInstance?.version)],-1)
printHtmlPart(18)
invokeTag('render','g',42,['template':("form")],-1)
printHtmlPart(19)
expressionOut.print(message(code: 'default.button.update.label', default: 'Update'))
printHtmlPart(20)
})
invokeTag('form','g',57,['url':([resource:flightClassInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138676L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
