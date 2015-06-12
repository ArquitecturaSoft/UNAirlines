import unairlines2.FlightClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_flightClassshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/flightClass/show.gsp" }
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
invokeTag('set','g',19,['var':("entityName"),'value':(message(code: 'flightClass.label', default: 'FlightClass'))],-1)
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
if(true && (flightClassInstance?.airline)) {
printHtmlPart(6)
createTagBody(3, {->
expressionOut.print(flightClassInstance?.airline?.name)
})
invokeTag('link','g',39,['class':("cLink"),'controller':("airline"),'action':("show"),'id':(flightClassInstance?.airline?.id)],3)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (flightClassInstance?.individualTv)) {
printHtmlPart(9)
invokeTag('checkBox','g',45,['name':("individualTv"),'value':(flightClassInstance?.individualTv),'disabled':("tue")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (flightClassInstance?.overWeightLuggage)) {
printHtmlPart(12)
invokeTag('checkBox','g',52,['name':("overWeightLuggage"),'value':(flightClassInstance?.overWeightLuggage),'disabled':("tue")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (flightClassInstance?.snacks)) {
printHtmlPart(13)
invokeTag('checkBox','g',59,['name':("snacks"),'value':(flightClassInstance?.snacks),'disabled':("tue")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (flightClassInstance?.vipRoom)) {
printHtmlPart(14)
invokeTag('checkBox','g',66,['name':("vipRoom"),'value':(flightClassInstance?.vipRoom),'disabled':("tue")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (flightClassInstance?.wifi)) {
printHtmlPart(15)
invokeTag('checkBox','g',73,['name':("wifi"),'value':(flightClassInstance?.wifi),'disabled':("tue")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (flightClassInstance?.type)) {
printHtmlPart(16)
invokeTag('fieldValue','g',80,['bean':(flightClassInstance),'field':("type")],-1)
printHtmlPart(7)
}
printHtmlPart(11)
if(true && (flightClassInstance?.multiplier)) {
printHtmlPart(17)
invokeTag('fieldValue','g',86,['bean':(flightClassInstance),'field':("multiplier")],-1)
printHtmlPart(7)
}
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('form','g',98,['action':("edit"),'resource':(flightClassInstance)],2)
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(21)
expressionOut.print(message(code: 'default.button.delete.confirm.message', default: 'Are you sure?'))
printHtmlPart(22)
})
invokeTag('form','g',103,['url':([resource:flightClassInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',116,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434079487785L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
