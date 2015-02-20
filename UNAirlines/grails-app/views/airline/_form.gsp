<%@ page import="unairlines.Airline" %>



<div class="fieldcontain ${hasErrors(bean: airlineInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="airline.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${airlineInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: airlineInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="airline.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${airlineInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: airlineInstance, field: 'phone', 'error')} required">
	<label for="phone">
		<g:message code="airline.phone.label" default="Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phone" required="" value="${airlineInstance?.phone}"/>

</div>

