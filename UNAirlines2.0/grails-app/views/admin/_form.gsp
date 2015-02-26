<%@ page import="unairlines2.Admin" %>



<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="admin.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${adminInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'surname', 'error')} required">
	<label for="surname">
		<g:message code="admin.surname.label" default="Surname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="surname" required="" value="${adminInstance?.surname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="admin.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${adminInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="admin.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="password" name="password" required="" value="${adminInstance?.password}"/>

</div>

