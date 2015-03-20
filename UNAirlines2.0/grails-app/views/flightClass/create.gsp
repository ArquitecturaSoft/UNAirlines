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
    <g:set var="entityName" value="${message(code: 'flight.label', default: 'Flight')}" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
</head>
<body>
    <header id="header">
        <g:render template="/common/menuA" />
    </header>
    <div id="create-flightClass" class="content scaffold-create" role="main">
        <br><br>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <g:hasErrors bean="${flightClassInstance}">
            <ul class="errors" role="alert">
                <g:eachError bean="${flightClassInstance}" var="error">
                    <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                    </g:eachError>
            </ul>
        </g:hasErrors>
        <g:form url="[resource:flightClassInstance, action:'save']" >
            <fieldset class="form">
                <div class="center">        
                    <h2>Creación de Categorías</h2>
                    <p class="lead">Por favor diligencia la siguiente información.</p>
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
                                    <button type="submit" name="create" class="btn btn-primary btn-lg" required="required"value="${message(code: 'default.button.create.label', default: 'Create')}" >Crear Categoria</button>
                                </div>
                            </div>
                            </section></center>
                        </g:form>
                    </div>
                    </body>
                    </html>