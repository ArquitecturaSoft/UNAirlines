<%@ page import="unairlines2.FlightClass" %>



<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'airline', 'error')} required">
	<label for="airline">
		<g:message code="flightClass.airline.label" default="Airline" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="airline" name="airline.id" from="${unairlines2.Airline.list()}" optionKey="id" required="" value="${flightClassInstance?.airline?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'individualTv', 'error')} ">
	<label for="individualTv">
		<g:message code="flightClass.individualTv.label" default="Individual Tv" />
		
	</label>
	<g:checkBox name="individualTv" value="${flightClassInstance?.individualTv}" />

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'multiplier', 'error')} required">
	<label for="multiplier">
		<g:message code="flightClass.multiplier.label" default="Multiplier" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="multiplier" value="${fieldValue(bean: flightClassInstance, field: 'multiplier')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'overWeightLuggage', 'error')} ">
	<label for="overWeightLuggage">
		<g:message code="flightClass.overWeightLuggage.label" default="Over Weight Luggage" />
		
	</label>
	<g:checkBox name="overWeightLuggage" value="${flightClassInstance?.overWeightLuggage}" />

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'snacks', 'error')} ">
	<label for="snacks">
		<g:message code="flightClass.snacks.label" default="Snacks" />
		
	</label>
	<g:checkBox name="snacks" value="${flightClassInstance?.snacks}" />

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="flightClass.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="type" required="" value="${flightClassInstance?.type}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'vipRoom', 'error')} ">
	<label for="vipRoom">
		<g:message code="flightClass.vipRoom.label" default="Vip Room" />
		
	</label>
	<g:checkBox name="vipRoom" value="${flightClassInstance?.vipRoom}" />

</div>

<div class="fieldcontain ${hasErrors(bean: flightClassInstance, field: 'wifi', 'error')} ">
	<label for="wifi">
		<g:message code="flightClass.wifi.label" default="Wifi" />
		
	</label>
	<g:checkBox name="wifi" value="${flightClassInstance?.wifi}" />

</div>

