
<%@ page import="unairlines.Customer" %>
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



    <g:set var="entityName" value="${message(code: 'customer.label', default: 'Customer')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
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
                        
                        <li class="active">                    
                            <g:form controller="Customer" action="create" method="post">
                                <button type="submit" class="btn btn-primary btn-lg">Registrarse</button>
                            </g:form>
                        </li>
                        <li class="active">
                            <g:form controller="Person" action="login" method="post">
                                <button type="submit" class="btn btn-primary btn-lg">Iniciar Sesi&oacute;n</button>
                            </g:form>
                        </</li>                       
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->

    </header><!--/header-->


    <section id="blog" class="container">
        <div class="center">
            <h2><a>Registro Exitoso</a></h2>
        </div>
        <div class="blog">
            <div class="row">
                <aside class="col-md-16">
                    <div class="widget categories">
                        <h3><img src="${resource(dir: 'images', file: 'avatar3.png')}" alt=""  />   Su cuenta ha sido creada Exitosamente</h3>
                        <div class="row">
                                <center>
                                    <a href="${createLink(uri: '/')}">
                                    <fieldset class="buttons">
                                        <button type="submit" class="btn btn-primary btn-lg">Volver a Inicio</button>
                                    </fieldset>
                                    </a>
                                </center>
                            </div>
                        </div>                     
                    </div><!--/.recent comments-->
                </aside>  
            </div><!--/.row-->
        </div>
    </section><!--/#blog-->
</body>
</html>
