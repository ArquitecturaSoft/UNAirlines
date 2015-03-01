<%@ page import="unairlines2.Admin" %>



<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'name', 'error')} required">
	Nombre*
	<g:textField name="name" required="" value="${adminInstance?.name}"/>

</div>


<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'surname', 'error')} required">
	Apellido*
	<g:textField name="surname" required="" value="${adminInstance?.surname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'email', 'error')} required">
	Correo Electronico*
	<g:field type="email" name="email" required="" value="${adminInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: adminInstance, field: 'password', 'error')} required">
	Contraseña*
	<g:field type="password" name="password" required="" value="${adminInstance?.password}"/>

</div>

