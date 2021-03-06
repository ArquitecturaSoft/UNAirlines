
<%@ page import="unairlines2.Customer" %>
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
        <g:render template="/common/menu" />
    </header>
	<section id="blog" class="container">
        <div class="center">
            <h2>Perfil de Usuario</h2>
        </div>
        <div class="blog">
            <div class="row">
                <div class="col-md-8">

                    <div class="blog-item">
                        <div class="row">
                            <div class="col-sm-10 blog-content">
                                <h2><a>Instrucciones de Uso de la Aplicación</a></h2>
                                <h3>Hola. Te damos la bienvenida. Dentro de nuestra aplicación podrás realizar alguna de las siguientes acciones:</h3>
                                <h4><a>Consultar Información de Aerolíneas: </a>Si oprimes el boton "Aerolíneas", accederás a toda la información de contacto de las aerolíneas.</h4>
                                <br>
                                <h4><a>Buscar Vuelos: </a>Dentro de nuestra aplicación podras buscar toda la información necesaria del vuelo que desees consultar. Para ello, presiona el botón "Buscar".</h4>
                                <br>
                                <h4><a>Hacer compra de Tiquetes en línea: </a>Si deseas reservar tu viaje, con UNAirlines podras hacer compras. Para ello, selecciona el boton "Buscar" y sigue todas las instrucciones.</h4>
                                <br>
                                <h4><a>Consultar tus vuelos: </a>Si oprimes el boton "mis vuelos", podrás acceder a una lista de los tiquetes de vuelo que has comprado.</h4>
                            </div>
                        </div>    
                    </div><!--/.blog-item-->

                </div><!--/.col-md-8-->
<aside class="col-md-4">
                    <div class="widget categories">
                        <h3><img src="${resource(dir: 'images', file: 'avatar3.png')}" alt=""  />   Informacion Personal</h3>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="single_comments">
                                    <g:if test="${customerInstance?.name}">
                                        <a>Nombre:</a>
                                        <g:fieldValue bean="${customerInstance}" field="name"/> 
                                    </g:if>
                                </div>

                                <div class="single_comments">
                                    <g:if test="${customerInstance?.surname}">
                                        <a>Apellido:</a>
                                        <g:fieldValue bean="${customerInstance}" field="surname"/>
                                    </g:if>
                                </div>

                                <div class="single_comments">
                                    <g:if test="${customerInstance?.email}">
                                        <a>Email:</a>
                                        <g:fieldValue bean="${customerInstance}" field="email"/>
                                    </g:if>
                                </div>

                                <div class="single_comments">
                                    <g:if test="${customerInstance?.address}">
                                        <a>Direccion:</a>
                                        <g:fieldValue bean="${customerInstance}" field="address"/>
                                    </g:if>
                                </div>

                                <div class="single_comments">
                                    <g:if test="${customerInstance?.phone}">
                                        <a>Telefono:</a>
                                        <g:fieldValue bean="${customerInstance}" field="phone"/>
                                    </g:if>
<center>
                                <g:form url="[resource:customerInstance, action:'edit']">
                                    <fieldset class="buttons">
                                        <g:link class="edit" action="edit" resource="${customerInstance}"><button type="submit" class="btn btn-primary btn-lg">Editar</button></g:link>
                                    </fieldset>
                                </g:form>
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
