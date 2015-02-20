
<%@ page import="unairlines.FlightClass" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'flightClass.label', default: 'FlightClass')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-flightClass" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-flightClass" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list flightClass">
			
				<g:if test="${flightClassInstance?.benefits}">
				<li class="fieldcontain">
					<span id="benefits-label" class="property-label"><g:message code="flightClass.benefits.label" default="Benefits" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.multiplier}">
				<li class="fieldcontain">
					<span id="multiplier-label" class="property-label"><g:message code="flightClass.multiplier.label" default="Multiplier" /></span>
					
						<span class="property-value" aria-labelledby="multiplier-label"><g:fieldValue bean="${flightClassInstance}" field="multiplier"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="flightClass.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${flightClassInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:flightClassInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${flightClassInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
