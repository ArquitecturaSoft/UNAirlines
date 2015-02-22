<%@ page import="unairlines.Admin" %>
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
                                                Con esta opcion Podras gestionar  (Crear, Actualizar, Eliminar, Visualizar) los vuelos que podran Visualizar nuestros clientes.<br><br>
                                        <center>Por favor, Elige una Opcion:
                                        <br>
                                        <a href="" class="btn btn-primary">Ver Lista</a>
                                        <a href="" class="btn btn-primary">Crear</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="tab-pane" id="tab2">
                                        <div class="media">
                                            <div class="pull-left">
                                                
                                            </div>
                                            <div class="media-body">
                                                Descripcion Opcion2 <br><br>
                                        <center>Por favor, Elige una Opcion:
                                        <br>
                                        <a href="" class="btn btn-primary">Ver Lista</a>
                                        <a href="" class="btn btn-primary">Crear</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="tab-pane" id="tab3">
                                        <h4>Descripcion3</h4>
                                                <p>Descripcion3</p>
                                    </div>

                                    <div class="tab-pane" id="tab4">
                                        <h4>Descripcion4</h4>
                                        <p>Descripcion4</p>
                                    </div>

                                    <div class="tab-pane" id="tab5">
                                        <h4>Descripcion5</h4>
                                        <p>Descripcion5</p>
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
