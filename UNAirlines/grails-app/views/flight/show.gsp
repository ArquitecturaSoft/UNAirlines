
<%@ page import="unairlines.Flight" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'flight.label', default: 'Flight')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-flight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-flight" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list flight">
			
				<g:if test="${flightInstance?.arrivalDate}">
				<li class="fieldcontain">
					<span id="arrivalDate-label" class="property-label"><g:message code="flight.arrivalDate.label" default="Arrival Date" /></span>
					
						<span class="property-value" aria-labelledby="arrivalDate-label"><g:formatDate date="${flightInstance?.arrivalDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.cost}">
				<li class="fieldcontain">
					<span id="cost-label" class="property-label"><g:message code="flight.cost.label" default="Cost" /></span>
					
						<span class="property-value" aria-labelledby="cost-label"><g:fieldValue bean="${flightInstance}" field="cost"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.departureDate}">
				<li class="fieldcontain">
					<span id="departureDate-label" class="property-label"><g:message code="flight.departureDate.label" default="Departure Date" /></span>
					
						<span class="property-value" aria-labelledby="departureDate-label"><g:formatDate date="${flightInstance?.departureDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="flight.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${flightInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.destination}">
				<li class="fieldcontain">
					<span id="destination-label" class="property-label"><g:message code="flight.destination.label" default="Destination" /></span>
					
						<span class="property-value" aria-labelledby="destination-label"><g:fieldValue bean="${flightInstance}" field="destination"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.gate}">
				<li class="fieldcontain">
					<span id="gate-label" class="property-label"><g:message code="flight.gate.label" default="Gate" /></span>
					
						<span class="property-value" aria-labelledby="gate-label"><g:fieldValue bean="${flightInstance}" field="gate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.number}">
				<li class="fieldcontain">
					<span id="number-label" class="property-label"><g:message code="flight.number.label" default="Number" /></span>
					
						<span class="property-value" aria-labelledby="number-label"><g:fieldValue bean="${flightInstance}" field="number"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.origin}">
				<li class="fieldcontain">
					<span id="origin-label" class="property-label"><g:message code="flight.origin.label" default="Origin" /></span>
					
						<span class="property-value" aria-labelledby="origin-label"><g:fieldValue bean="${flightInstance}" field="origin"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:flightInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${flightInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
