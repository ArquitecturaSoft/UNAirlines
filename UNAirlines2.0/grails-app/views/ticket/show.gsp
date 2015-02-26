
<%@ page import="unairlines2.Ticket" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ticket.label', default: 'Ticket')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-ticket" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-ticket" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list ticket">
			
				<g:if test="${ticketInstance?.code}">
				<li class="fieldcontain">
					<span id="code-label" class="property-label"><g:message code="ticket.code.label" default="Code" /></span>
					
						<span class="property-value" aria-labelledby="code-label"><g:fieldValue bean="${ticketInstance}" field="code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.flight}">
				<li class="fieldcontain">
					<span id="flight-label" class="property-label"><g:message code="ticket.flight.label" default="Flight" /></span>
					
						<span class="property-value" aria-labelledby="flight-label"><g:link controller="flight" action="show" id="${ticketInstance?.flight?.id}">${ticketInstance?.flight?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.passengerBirthDate}">
				<li class="fieldcontain">
					<span id="passengerBirthDate-label" class="property-label"><g:message code="ticket.passengerBirthDate.label" default="Passenger Birth Date" /></span>
					
						<span class="property-value" aria-labelledby="passengerBirthDate-label"><g:formatDate date="${ticketInstance?.passengerBirthDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.passengerID}">
				<li class="fieldcontain">
					<span id="passengerID-label" class="property-label"><g:message code="ticket.passengerID.label" default="Passenger ID" /></span>
					
						<span class="property-value" aria-labelledby="passengerID-label"><g:fieldValue bean="${ticketInstance}" field="passengerID"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.passengerLastName}">
				<li class="fieldcontain">
					<span id="passengerLastName-label" class="property-label"><g:message code="ticket.passengerLastName.label" default="Passenger Last Name" /></span>
					
						<span class="property-value" aria-labelledby="passengerLastName-label"><g:fieldValue bean="${ticketInstance}" field="passengerLastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.passengerName}">
				<li class="fieldcontain">
					<span id="passengerName-label" class="property-label"><g:message code="ticket.passengerName.label" default="Passenger Name" /></span>
					
						<span class="property-value" aria-labelledby="passengerName-label"><g:fieldValue bean="${ticketInstance}" field="passengerName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.price}">
				<li class="fieldcontain">
					<span id="price-label" class="property-label"><g:message code="ticket.price.label" default="Price" /></span>
					
						<span class="property-value" aria-labelledby="price-label"><g:fieldValue bean="${ticketInstance}" field="price"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ticketInstance?.seat}">
				<li class="fieldcontain">
					<span id="seat-label" class="property-label"><g:message code="ticket.seat.label" default="Seat" /></span>
					
						<span class="property-value" aria-labelledby="seat-label"><g:fieldValue bean="${ticketInstance}" field="seat"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:ticketInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${ticketInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
