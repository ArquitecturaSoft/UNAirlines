
<%@ page import="unairlines2.Airline" %>
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
    <g:set var="entityName" value="${message(code: 'airline.label', default: 'Airline')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
    <header id="header">
        <g:render template="/common/menuA" />
    </header>
    <section id="blog" class="container">
        <div class="center">
            <h2>Información de Aerolínea</h2>
        </div>
        <div class="blog">
            <div class="row">
                <aside class="col-md-16">
                    <div class="widget categories">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="single_comments">
                                    <g:if test="${airlineInstance?.address}">	
                                        <a>Dirección: </a>
                                        <g:fieldValue bean="${airlineInstance}" field="address"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${airlineInstance?.flightClasses}">
                                        <a>Categorías: </a>
                                        <g:each in="${airlineInstance.flightClasses}" var="f">
                                            <br>&emsp;&emsp;&emsp;<g:link class="cLink" controller="flightClass" action="show" id="${f.id}">${f?.type}</g:link>
                                        </g:each>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${airlineInstance?.flights}">
                                        <a>Vuelos:</a>
                                        <g:each in="${airlineInstance.flights}" var="f">
                                            <br>&emsp;&emsp;&emsp;<g:link class="cLink" controller="flight" action="show" id="${f.id}">${f?.numberFlight}/${f?.origin}-${f?.destination}</g:link>
                                        </g:each>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${airlineInstance?.name}">
                                        <a>Nombre: </a>
                                        <g:fieldValue bean="${airlineInstance}" field="name"/>
                                    </g:if>
                                </div>
                                <div class="single_comments">
                                    <g:if test="${airlineInstance?.phone}">
                                        <a>Telefono: </a>
                                        <g:fieldValue bean="${airlineInstance}" field="phone"/>
                                    </g:if>
                                </div>
                                <center>
                                    <section id="contact-page">
                                        <div class="container">
                                            <div class="row contact-wrap"> 
                                                <div class="col-sm-5 col-sm-offset-1">                   
                                                    <div class="form-group">
                                                        <ul class="nav navbar-nav">  
                                                            <li><g:form  action="edit" resource="${airlineInstance}">
                                                                    <button type="submit" class="btn btn-primary btn-lg">Editar</button>
                                                                </g:form>
                                                            </li>
                                                            <li>
                                                                <g:form url="[resource:airlineInstance, action:'delete']" method="DELETE">
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
