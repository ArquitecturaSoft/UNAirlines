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
    <g:set var="entityName" value="${message(code: 'customer.label', default: 'Customer')}" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
</head>

<body>

    <header id="header">
        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src="${resource(dir: 'images', file: 'logo.png')}" alt="logo"/></a>
                </div>

                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <!--<li class="active"><a href="index.html">Home</a></li>-->
                        <li class="active"><a href="about-us.html">Registrarse</a></li>
                        <li class="active"><a href="services.html">iniciar Sesion</a></li>                       
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->

    </header><!--/header-->
    <div id="create-customer" class="content scaffold-create" role="main">
        <h1><g:message code="default.create.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <g:hasErrors bean="${customerInstance}">
            <ul class="errors" role="alert">
                <g:eachError bean="${customerInstance}" var="error">
                    <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                    </g:eachError>
            </ul>
        </g:hasErrors>
        <g:form url="[resource:customerInstance, action:'save']" >
            <fieldset class="form">
                <g:render template="form"/>
            </fieldset>		             
            <center>
            <section id="contact-page">
                <div class="container">

                    <div class="row contact-wrap"> 
                        <div class="status alert alert-success" style="display: none"></div>
                        <div class="col-sm-5 col-sm-offset-1">                   
                            <div class="form-group">
                                 <button type="submit" name="create" class="btn btn-primary btn-lg" required="required"value="${message(code: 'default.button.create.label', default: 'Create')}" >Sign-Up!</button>
                            </div>
                        </div>
                        </section></center>
                    </g:form>
                </div>
                </body>
                </html>
