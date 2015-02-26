<%@ page import="unairlines2.Airline" %>



<div class="fieldcontain ${hasErrors(bean: airlineInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="airline.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${airlineInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: airlineInstance, field: 'flightClasses', 'error')} ">
	<label for="flightClasses">
		<g:message code="airline.flightClasses.label" default="Flight Classes" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${airlineInstance?.flightClasses?}" var="f">
    <li><g:link controller="flightClass" action="show" id="${f.id}">${f?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="flightClass" action="create" params="['airline.id': airlineInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'flightClass.label', default: 'FlightClass')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: airlineInstance, field: 'flights', 'error')} ">
	<label for="flights">
		<g:message code="airline.flights.label" default="Flights" />
		
	</label>
	<g:select name="flights" from="${unairlines2.Flight.list()}" multiple="multiple" optionKey="id" size="5" value="${airlineInstance?.flights*.id}" class="many-to-many"/>

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

