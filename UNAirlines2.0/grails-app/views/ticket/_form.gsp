<%@ page import="unairlines2.Ticket" %>



<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="ticket.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" required="" value="${newCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'flight', 'error')} required">
	<label for="flight">
		<g:message code="ticket.flight.label" default="Flight" />
		<span class="required-indicator">*</span>
	</label>
        <g:textField name="flight.id" required="" value="${flightID}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'passengerBirthDate', 'error')} required">
	<label for="passengerBirthDate">
		<g:message code="ticket.passengerBirthDate.label" default="Passenger Birth Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="passengerBirthDate" precision="day"  value="${ticketInstance?.passengerBirthDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'passengerID', 'error')} required">
	<label for="passengerID">
		<g:message code="ticket.passengerID.label" default="Passenger ID" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="passengerID" required="" value="${ticketInstance?.passengerID}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'passengerLastName', 'error')} required">
	<label for="passengerLastName">
		<g:message code="ticket.passengerLastName.label" default="Passenger Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="passengerLastName" required="" value="${ticketInstance?.passengerLastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'passengerName', 'error')} required">
	<label for="passengerName">
		<g:message code="ticket.passengerName.label" default="Passenger Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="passengerName" required="" value="${ticketInstance?.passengerName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="ticket.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="price" value="${price}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'seat', 'error')} required">
	<label for="seat">
		<g:message code="ticket.seat.label" default="Seat" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="seat" from="${availableSeats}"/>

</div>

