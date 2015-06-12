import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0index_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(4)
invokeTag('stylesheet','asset',8,['src':("bootstrap.min.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',9,['src':("font-awesome.min.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',10,['src':("animate.min.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',11,['src':("prettyPhoto.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',12,['src':("main.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',13,['src':("responsive.css")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',14,['src':("jquery.js")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',15,['src':("bootstrap.min.js")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',16,['src':("jquery.prettyPhoto.js")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',17,['src':("jquery.isotope.min.js")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',18,['src':("main.js")],-1)
printHtmlPart(5)
invokeTag('javascript','asset',19,['src':("wow.min.js")],-1)
printHtmlPart(6)
invokeTag('stylesheet','asset',21,['src':("base.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',22,['src':("skeleton.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',23,['src':("layout.css")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',25,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('form','g',48,['controller':("Customer"),'action':("create"),'method':("post")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('form','g',53,['controller':("Person"),'action':("login"),'method':("post")],2)
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'bg1.jpg'))
printHtmlPart(15)
expressionOut.print(resource(dir: 'images', file: 'img1.png'))
printHtmlPart(16)
expressionOut.print(resource(dir: 'images', file: 'bg2.jpg'))
printHtmlPart(17)
expressionOut.print(resource(dir: 'images', file: 'img2.png'))
printHtmlPart(16)
expressionOut.print(resource(dir: 'images', file: 'bg3.jpg'))
printHtmlPart(18)
expressionOut.print(resource(dir: 'images', file: 'img3.png'))
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',132,['class':("homepage")],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434051181356L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
