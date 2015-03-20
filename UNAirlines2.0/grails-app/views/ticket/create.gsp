<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
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
		<g:set var="entityName" value="${message(code: 'ticket.label', default: 'Ticket')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
		<header id="header">
        <g:render template="/common/menu" />
    </header>
		<div id="create-ticket" class="content scaffold-create" role="main">
			<br><br>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${ticketInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${ticketInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:ticketInstance, action:'save']" >
				<fieldset class="form">
                                    <div class="center">        
                    <h2>Información de Compra</h2>
                    <p class="lead">Por favor diligencia la siguiente información.</p>
                </div>
					<g:render template="form"/>
                                        
                 
		<section id="contact-page">
    <div class="container">
        <div class="row contact-wrap"> 
            <div class="status alert alert-success" style="display: none"></div>
            <form id="main-contact-form" class="contact-form" name="contact-form" method="post">
                <div class="col-sm-5 col-sm-offset-1">
                    <h2>Datos de la Tarjeta de Crédito o Débito</h2>
                    <div class="form-group">
                        <label>Número*</label>
                            <br>
                            <input name="numT" type="text" placeholder="Ej. 5555-4444-3333-2222" pattern ="[0-9]{13,16}">
                    </div>
                    <div class="form-group">
                        <label>Nombre del Titular*</label>
                        <br>
                            <input name="nameT" type="text">
                    </div> 
        </div>
        </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#contact-page-->	
    <center>
                <section id="contact-page">
                    <div class="container">

                        <div class="row contact-wrap"> 
                            <div class="status alert alert-success" style="display: none"></div>
                            <div class="col-sm-5 col-sm-offset-1">                   
                                <div class="form-group">
                                    <button type="submit" name="create" class="btn btn-primary btn-lg" required="required"value="${message(code: 'default.button.create.label', default: 'Create')}" >Aceptar</button>
                                </div>
                            </div>
                            </section></center>
                            <div class="form-bg">
            
               

    </div><!-- container -->
                        </g:form>
                    </div>
                    </body>
                    </html>