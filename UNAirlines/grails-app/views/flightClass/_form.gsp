<%@ page import="unairlines.FlightClass" %>



<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'benefits', 'error')} required">
	<label for="benefits">
		<g:message code="flightClass.benefits.label" default="Benefits" />
		<span class="required-indicator">*</span>
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'multiplier', 'error')} required">
	<label for="multiplier">
		<g:message code="flightClass.multiplier.label" default="Multiplier" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="multiplier" value="${fieldValue(bean: flightClassInstance, field: 'multiplier')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="flightClass.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="type" required="" value="${flightClassInstance?.type}"/>

</div>

