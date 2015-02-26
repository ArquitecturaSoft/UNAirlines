<%@ page import="unairlines2.Customer" %>



<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="customer.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${customerInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'surname', 'error')} required">
	<label for="surname">
		<g:message code="customer.surname.label" default="Surname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="surname" required="" value="${customerInstance?.surname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="customer.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${customerInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="customer.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="password" name="password" required="" value="${customerInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="customer.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${customerInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'phone', 'error')} required">
	<label for="phone">
		<g:message code="customer.phone.label" default="Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phone" required="" value="${customerInstance?.phone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'tickets', 'error')} ">
	<label for="tickets">
		<g:message code="customer.tickets.label" default="Tickets" />
		
	</label>
	<g:select name="tickets" from="${unairlines2.Ticket.list()}" multiple="multiple" optionKey="id" size="5" value="${customerInstance?.tickets*.id}" class="many-to-many"/>

</div>

