<%@ page import="unairlines2.Flight" %>



<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'airline', 'error')} required">
	<label for="airline">
		<g:message code="flight.airline.label" default="Airline" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="airline" name="airline.id" from="${unairlines2.Airline.list()}" optionKey="id" required="" value="${flightInstance?.airline?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'arrivalDate', 'error')} required">
	<label for="arrivalDate">
		<g:message code="flight.arrivalDate.label" default="Arrival Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="arrivalDate" precision="day"  value="${flightInstance?.arrivalDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'cost', 'error')} required">
	<label for="cost">
		<g:message code="flight.cost.label" default="Cost" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cost" value="${fieldValue(bean: flightInstance, field: 'cost')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'departureDate', 'error')} required">
	<label for="departureDate">
		<g:message code="flight.departureDate.label" default="Departure Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="departureDate" precision="day"  value="${flightInstance?.departureDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="flight.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${flightInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'destination', 'error')} required">
	<label for="destination">
		<g:message code="flight.destination.label" default="Destination" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="destination" required="" value="${flightInstance?.destination}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'gate', 'error')} required">
	<label for="gate">
		<g:message code="flight.gate.label" default="Gate" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="gate" required="" value="${flightInstance?.gate}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'numberFlight', 'error')} required">
	<label for="numberFlight">
		<g:message code="flight.numberFlight.label" default="Number Flight" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numberFlight" required="" value="${flightInstance?.numberFlight}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'origin', 'error')} required">
	<label for="origin">
		<g:message code="flight.origin.label" default="Origin" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="origin" required="" value="${flightInstance?.origin}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightInstance, field: 'tickets', 'error')} ">
	<label for="tickets">
		<g:message code="flight.tickets.label" default="Tickets" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${flightInstance?.tickets?}" var="t">
    <li><g:link controller="ticket" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="ticket" action="create" params="['flight.id': flightInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'ticket.label', default: 'Ticket')])}</g:link>
</li>
</ul>


</div>

