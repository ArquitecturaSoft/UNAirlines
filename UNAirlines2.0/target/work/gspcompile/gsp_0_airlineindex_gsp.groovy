import unairlines2.Airline
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_airlineindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/airline/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',7,['src':("bootstrap.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',8,['src':("font-awesome.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',9,['src':("animate.min.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("prettyPhoto.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',12,['src':("responsive.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',13,['src':("table.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',14,['src':("jquery.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',15,['src':("bootstrap.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',16,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',17,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',18,['src':("main.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',19,['src':("wow.min.js")],-1)
printHtmlPart(3)
invokeTag('set','g',20,['var':("entityName"),'value':(message(code: 'airline.label', default: 'Airline'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',21,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',21,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',21,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (session.isAdmin == true)) {
printHtmlPart(6)
invokeTag('render','g',26,['template':("/common/menuA")],-1)
printHtmlPart(7)
}
printHtmlPart(7)
if(true && (session.isCustomer == true)) {
printHtmlPart(6)
invokeTag('render','g',29,['template':("/common/menu")],-1)
printHtmlPart(7)
}
printHtmlPart(8)
loop:{
int i = 0
for( airlineInstance in (airlineInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(10)
if(true && (session.isAdmin == true)) {
createTagBody(4, {->
expressionOut.print(fieldValue(bean: airlineInstance, field: "name"))
})
invokeTag('link','g',50,['action':("show"),'id':(airlineInstance.id)],4)
}
printHtmlPart(11)
if(true && (session.isCustomer == true)) {
expressionOut.print(fieldValue(bean: airlineInstance, field: "name"))
}
printHtmlPart(12)
expressionOut.print(fieldValue(bean: airlineInstance, field: "address"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: airlineInstance, field: "phone"))
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
if(true && (session.isAdmin == true)) {
printHtmlPart(2)
createClosureForHtmlPart(16, 3)
invokeTag('form','g',66,['controller':("airline"),'action':("create")],3)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1428730175315L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
