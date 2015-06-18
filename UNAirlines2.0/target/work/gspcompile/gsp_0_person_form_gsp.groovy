import unairlines2.Person
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_0_person_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/person/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: personInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("person.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(personInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'surname', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("person.surname.label"),'default':("Surname")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("surname"),'required':(""),'value':(personInstance?.surname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("person.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['type':("email"),'name':("email"),'required':(""),'value':(personInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'password', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("person.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("password"),'name':("password"),'required':(""),'value':(personInstance?.password)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1425835246912L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
