
<%@ page import="unairlines2.FlightClass" %>
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
			
				<g:if test="${flightClassInstance?.airline}">
				<li class="fieldcontain">
					<span id="airline-label" class="property-label"><g:message code="flightClass.airline.label" default="Airline" /></span>
					
						<span class="property-value" aria-labelledby="airline-label"><g:link controller="airline" action="show" id="${flightClassInstance?.airline?.id}">${flightClassInstance?.airline?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.individualTv}">
				<li class="fieldcontain">
					<span id="individualTv-label" class="property-label"><g:message code="flightClass.individualTv.label" default="Individual Tv" /></span>
					
						<span class="property-value" aria-labelledby="individualTv-label"><g:formatBoolean boolean="${flightClassInstance?.individualTv}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.multiplier}">
				<li class="fieldcontain">
					<span id="multiplier-label" class="property-label"><g:message code="flightClass.multiplier.label" default="Multiplier" /></span>
					
						<span class="property-value" aria-labelledby="multiplier-label"><g:fieldValue bean="${flightClassInstance}" field="multiplier"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.overWeightLuggage}">
				<li class="fieldcontain">
					<span id="overWeightLuggage-label" class="property-label"><g:message code="flightClass.overWeightLuggage.label" default="Over Weight Luggage" /></span>
					
						<span class="property-value" aria-labelledby="overWeightLuggage-label"><g:formatBoolean boolean="${flightClassInstance?.overWeightLuggage}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.snacks}">
				<li class="fieldcontain">
					<span id="snacks-label" class="property-label"><g:message code="flightClass.snacks.label" default="Snacks" /></span>
					
						<span class="property-value" aria-labelledby="snacks-label"><g:formatBoolean boolean="${flightClassInstance?.snacks}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="flightClass.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${flightClassInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.vipRoom}">
				<li class="fieldcontain">
					<span id="vipRoom-label" class="property-label"><g:message code="flightClass.vipRoom.label" default="Vip Room" /></span>
					
						<span class="property-value" aria-labelledby="vipRoom-label"><g:formatBoolean boolean="${flightClassInstance?.vipRoom}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightClassInstance?.wifi}">
				<li class="fieldcontain">
					<span id="wifi-label" class="property-label"><g:message code="flightClass.wifi.label" default="Wifi" /></span>
					
						<span class="property-value" aria-labelledby="wifi-label"><g:formatBoolean boolean="${flightClassInstance?.wifi}" /></span>
					
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
