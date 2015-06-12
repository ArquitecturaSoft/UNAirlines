import unairlines2.Admin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_adminlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
invokeTag('stylesheet','asset',8,['src':("bootstrap.min.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',9,['src':("font-awesome.min.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',10,['src':("animate.min.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',11,['src':("prettyPhoto.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',12,['src':("main.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',13,['src':("responsive.css")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',14,['src':("jquery.js")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',15,['src':("bootstrap.min.js")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',16,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',17,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',18,['src':("main.js")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',19,['src':("wow.min.js")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',21,['src':("base.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',22,['src':("skeleton.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',23,['src':("layout.css")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',25,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('form','g',48,['controller':("Customer"),'action':("create"),'method':("post")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('form','g',53,['controller':("Person"),'action':("login"),'method':("post")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
})
invokeTag('form','g',70,['controller':("Admin"),'action':("doLogin"),'method':("post")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',75,['class':("homepage")],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1431931138660L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
