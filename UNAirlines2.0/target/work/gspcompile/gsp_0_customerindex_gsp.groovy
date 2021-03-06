import unairlines2.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_customerindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',7,['src':("bootstrap.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',8,['src':("font-awesome.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',9,['src':("animate.min.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',10,['src':("prettyPhoto.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',11,['src':("main.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',12,['src':("responsive.css")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',13,['src':("table.css")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',14,['src':("jquery.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',15,['src':("bootstrap.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',16,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',17,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',18,['src':("main.js")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',19,['src':("wow.min.js")],-1)
printHtmlPart(2)
invokeTag('set','g',20,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',21,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',21,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',21,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',25,['template':("/common/menuA")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( customerInstance in (customerInstanceList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: customerInstance, field: "name"))
})
invokeTag('link','g',45,['action':("show"),'id':(customerInstance.id)],3)
printHtmlPart(9)
expressionOut.print(fieldValue(bean: customerInstance, field: "surname"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: customerInstance, field: "email"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: customerInstance, field: "password"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: customerInstance, field: "address"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: customerInstance, field: "phone"))
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1425835246901L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
