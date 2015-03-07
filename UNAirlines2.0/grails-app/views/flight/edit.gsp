<%@ page import="unairlines2.Flight" %>
<!DOCTYPE html>
<html>
	<head>
            <asset:stylesheet src="bootstrap.min.css" />
            <asset:stylesheet src="font-awesome.min.css"/>
            <asset:stylesheet src="animate.min.css"/>
            <asset:stylesheet src="prettyPhoto.css"/>
            <asset:stylesheet src="main.css"/>
            <asset:stylesheet src="responsive.css"/>

            <asset:javascript src="jquery.js" />
            <asset:javascript src="bootstrap.min.js" />
            <asset:javascript src="jquery.prettyPhoto.js" />
            <asset:javascript src="jquery.isotope.min.js" />
            <asset:javascript src="main.js" />
            <asset:javascript src="wow.min.js" />
		<g:set var="entityName" value="${message(code: 'flight.label', default: 'Flight')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
		
			<header id="header">
        <g:render template="/common/menuA" />
    </header>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${flightInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${flightInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:flightInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${flightInstance?.version}" />
				<fieldset class="form">
                                    <div class="center">  
                <br>
                <h2>Editar Informacion De Vuelo</h2>
            </div> 
					<g:render template="form"/>
				</fieldset>
				<center>
        <section id="contact-page">
            <div class="container">

                <div class="row contact-wrap"> 
                    <div class="status alert alert-success" style="display: none"></div>
                    <div class="col-sm-5 col-sm-offset-1">                   
                        <div class="form-group">
                            <button type="submit" name="update" class="btn btn-primary btn-lg" required="required"value="${message(code: 'default.button.update.label', default: 'Update')}">Actualizar</button>
                        </div>
                    </div>
                    </section>
                    </center>
			</g:form>
		
	</body>
</html>
