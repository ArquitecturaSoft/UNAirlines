<%@ page import="unairlines.Ticket" %>



<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="ticket.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" required="" value="${ticketInstance?.code}"/>

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
	<g:field name="price" value="${fieldValue(bean: ticketInstance, field: 'price')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: ticketInstance, field: 'seat', 'error')} required">
	<label for="seat">
		<g:message code="ticket.seat.label" default="Seat" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="seat" type="number" value="${ticketInstance.seat}" required=""/>

</div>

