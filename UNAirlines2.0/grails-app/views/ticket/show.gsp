
<%@ page import="unairlines2.Ticket" %>
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
		<g:set var="entityName" value="${message(code: 'ticket.label', default: 'Ticket')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<header id="header">
        <g:render template="/common/menu" />
    </header>
    <section id="blog" class="container">
        <div class="center">
            <h2>Compra Exitosa</h2>
        </div>
        <div class="blog">
            <div class="row">
                <aside class="col-md-16">
                    <div class="widget categories">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="single_comments">
                                    <g:if test="${ticketInstance?.code}">
                                        <a>Código: </a>
                                        <g:fieldValue bean="${ticketInstance}" field="code"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${ticketInstance?.flight}">
                                        <a>Vuelo: </a>
                                        <br>&emsp;&emsp;&emsp;<g:link controller="flight" action="show" id="${ticketInstance?.flight?.id}">${ticketInstance?.flight?.origin}-${ticketInstance?.flight?.destination}</g:link>
                                    </g:if>
                                </div>
				<div class="single_comments">
                                    <g:if test="${ticketInstance?.passengerBirthDate}">
                                        <a>Fecha de Nacimiento del Pasajero: </a>
                                        <g:formatDate date="${ticketInstance?.passengerBirthDate}" format="yyyy-mm-dd" />
                                    </g:if>
                                </div>
				<div class="single_comments">
                                    <g:if test="${ticketInstance?.passengerID}">
                                        <a>Id del Pasajero: </a>
                                        <g:fieldValue bean="${ticketInstance}" field="passengerID"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${ticketInstance?.passengerLastName}">
                                        <a>Apellido del Pasajero: </a>
                                        <g:fieldValue bean="${ticketInstance}" field="passengerLastName"/>
                                    </g:if>
                                </div>
				<div class="single_comments">
                                    <g:if test="${ticketInstance?.passengerName}">
                                        <a>Nombre del Pasajero: </a>
                                        <g:fieldValue bean="${ticketInstance}" field="passengerName"/>
                                    </g:if>
                                </div>
				<div class="single_comments">
                                    <g:if test="${ticketInstance?.price}">
                                        <a>Precio: </a>
                                        <g:fieldValue bean="${ticketInstance}" field="price"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${ticketInstance?.seat}">
                                        <a>Silla: </a>
                                        <g:fieldValue bean="${ticketInstance}" field="seat"/>
                                    </g:if>
                                </div>
                            </div>
                        </div>        
                    </div>            
            </div>
            </body>
            </html>
