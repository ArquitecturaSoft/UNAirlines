
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
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<header id="header">
                     <g:render template="/common/menuA" />
                </header>
                <section id="blog" class="container">
        <div class="center">
            <h2>Información del Vuelo</h2>
        </div>
        <div class="blog">
            <div class="row">
                <aside class="col-md-16">
                    <div class="widget categories">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="single_comments">
                                   <g:if test="${flightInstance?.airline}">	
                                        <a>Aeorlínea: </a>
                                        <br>&emsp;&emsp;&emsp;<g:link class="cLink" controller="airline" action="show" id="${flightInstance?.airline?.id}">${flightInstance?.airline?.name}</g:link></span>
                                    </g:if>
                                </div> 
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.numberFlight}">
                                        <a>Número de Vuelo: </a>
                                        <g:fieldValue bean="${flightInstance}" field="numberFlight"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.origin}">
                                        <a>Ciudad de Origen: </a>
                                        <g:fieldValue bean="${flightInstance}" field="origin"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.destination}">
                                        <a>Ciudad de Destino: </a>
                                        <g:fieldValue bean="${flightInstance}" field="destination"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.departureDate}">
                                        <a>Fecha de Partida: </a>
                                        <g:formatDate date="${flightInstance?.departureDate}" format="yyyy-mm-dd" />
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.arrivalDate}">
                                        <a>Fecha de Llegada: </a>
                                        <g:formatDate date="${flightInstance?.arrivalDate}" format="yyyy-mm-dd"  />
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.gate}">
                                        <a>Gate: </a>
                                        <g:fieldValue bean="${flightInstance}" field="gate"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.description}">
                                        <a>Descripción: </a>
                                        <g:fieldValue bean="${flightInstance}" field="description"/>
                                    </g:if>
                                </div>  
                                <div class="single_comments">
                                    <g:if test="${flightInstance?.cost}">
                                        <a>Precio: </a>
                                        $<g:fieldValue bean="${flightInstance}" field="cost"/>
                                    </g:if>
                                </div> 
	 <center>
                                    <section id="contact-page">
                                        <div class="container">
                                            <div class="row contact-wrap"> 
                                                <div class="col-sm-5 col-sm-offset-1">                   
                                                    <div class="form-group">
                                                        <ul class="nav navbar-nav">  
                                                            <li><g:form  action="edit" resource="${flightInstance}">
                                                                    <button type="submit" class="btn btn-primary btn-lg">Editar</button>
                                                                </g:form>
                                                            </li>
                                                            <li>
                                                                <g:form url="[resource:flightInstance, action:'delete']" method="DELETE">
                                                                    <button type="submit" class="btn btn-primary btn-lg"onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');">Eliminar</button>
                                                                </g:form>
                                                            </li>
                                                        </ul> 
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                </center>
                            </div>
                        </div>        
                    </div>            
            </div>
            </body>
            </html>

			
			