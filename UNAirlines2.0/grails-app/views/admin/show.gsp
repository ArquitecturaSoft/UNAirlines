
<%@ page import="unairlines2.Admin" %>
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

    <g:set var="entityName" value="${message(code: 'admin.label', default: 'Admin')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

	<body>
    <header id="header">
        <g:render template="/common/menuA" />
    </header>
    <section id="content" class="shortcode-item">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-17">
                    <h2>Panel de Administrador</h2> 
                    <div class="tab-wrap">
                        <div class="media">
                            <g:render template="/common/leftPanel" />
                            <div class="parrent media-body">
                                <div class="tab-content">
                                    <div class="tab-pane active in" id="tab1">
                                        <div class="media">
                                            <div class="pull-left">
                                                <img class="img-responsive" src="${resource(dir: 'images', file: 'tab1.png')}">
                                            </div>
                                            <div class="media-body">
                                                Con esta opción Podras gestionar  (Crear, Actualizar, Eliminar, Visualizar) las aerolineas que ofrecen nuestros servicios y que podran consultar nuestros clientes.<br><br>
                                        <center>Por favor, Elige una Opcion:
                                        <br>
                                        <g:form controller="airline" action="index">
                                            <button type="submit" class="btn btn-primary btn-lg">Ver </button></li>
                                        </g:form>
                                        <g:form controller="airline" action="create">
                                            <button type="submit" class="btn btn-primary btn-lg">Crear</button></li>
                                        </g:form>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="tab-pane" id="tab2">
                                        <div class="media">
                                            <div class="pull-left">
                                                <img class="img-responsive" src="${resource(dir: 'images', file: 'tab1.png')}">
                                            </div>
                                            <div class="media-body">
                                                Con esta opcion Podras gestionar  (Crear, Actualizar, Eliminar, Visualizar) los vuelos que podran Visualizar nuestros clientes.<br><br>
                                        <center>Por favor, Elige una Opcion:
                                        <br>
                                        <g:form controller="flight" action="index">
                                            <button type="submit" class="btn btn-primary btn-lg">Ver </button></li>
                                        </g:form>
                                        <g:form controller="flight" action="create">
                                            <button type="submit" class="btn btn-primary btn-lg">Crear</button></li>
                                        </g:form>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="tab-pane" id="tab3">
                                        <div class="media">
                                            <div class="pull-left">
                                                <img class="img-responsive" src="${resource(dir: 'images', file: 'tab1.png')}">
                                            </div>
                                            <div class="media-body">
                                                Con esta opcion Podras gestionar  (Crear, Actualizar, Eliminar, Visualizar) las distintas categorias de servicios que ofrecen las aerolineas.<br><br>
                                        <center>Por favor, Elige una Opcion:
                                        <br>
                                        <g:form controller="flightClass" action="index">
                                            <button type="submit" class="btn btn-primary btn-lg">Ver </button></li>
                                        </g:form>
                                        <g:form controller="flightClass" action="create">
                                            <button type="submit" class="btn btn-primary btn-lg">Crear</button></li>
                                        </g:form>
                                            </div>
                                        </div>
                                    </div>
                                </div> <!--/.tab-content-->  
                            </div> <!--/.media-body--> 
                        </div> <!--/.media-->     
                    </div><!--/.tab-wrap-->               
                </div><!--/.col-sm-6-->
            </div>
        </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#content-->
</body>

</html>
