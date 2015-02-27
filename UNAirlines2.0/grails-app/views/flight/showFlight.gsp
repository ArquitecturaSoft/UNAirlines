
<%@ page import="unairlines2.Flight" %>
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
			
				<g:if test="${flightInstance?.airline}">
				<li class="fieldcontain">
					<span id="airline-label" class="property-label"><g:message code="flight.airline.label" default="Airline" /></span>
					
						<span class="property-value" aria-labelledby="airline-label"><g:link controller="airline" action="show" id="${flightInstance?.airline?.id}">${flightInstance?.airline?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.arrivalDate}">
				<li class="fieldcontain">
					<span id="arrivalDate-label" class="property-label"><g:message code="flight.arrivalDate.label" default="Arrival Date" /></span>
					
						<span class="property-value" aria-labelledby="arrivalDate-label"><g:formatDate date="${flightInstance?.arrivalDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.cost}">
				<li class="fieldcontain">
					<span id="cost-label" class="property-label"><g:message code="flight.cost.label" default="Cost" /></span>
					
						<span class="property-value" aria-labelledby="cost-label">${flightInstance.cost * multiplier}</span>
					
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
			
				<g:if test="${flightInstance?.numberFlight}">
				<li class="fieldcontain">
					<span id="numberFlight-label" class="property-label"><g:message code="flight.numberFlight.label" default="Number Flight" /></span>
					
						<span class="property-value" aria-labelledby="numberFlight-label"><g:fieldValue bean="${flightInstance}" field="numberFlight"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.origin}">
				<li class="fieldcontain">
					<span id="origin-label" class="property-label"><g:message code="flight.origin.label" default="Origin" /></span>
					
						<span class="property-value" aria-labelledby="origin-label"><g:fieldValue bean="${flightInstance}" field="origin"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${flightInstance?.tickets}">
				<li class="fieldcontain">
					<span id="tickets-label" class="property-label"><g:message code="flight.tickets.label" default="Tickets" /></span>
					
						<g:each in="${flightInstance.tickets}" var="t">
						<span class="property-value" aria-labelledby="tickets-label"><g:link controller="ticket" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
		</div>
	</body>
</html>
