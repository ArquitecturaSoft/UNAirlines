
<%@ page import="unairlines2.FlightClass" %>
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
    <g:set var="entityName" value="${message(code: 'flightClass.label', default: 'FlightClass')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
		<header id="header">
                     <g:render template="/common/menuA" />
                </header>
                <section id="blog" class="container">
        <div class="center">
            <h2>Información de Categoría</h2>
        </div>
        <div class="blog">
            <div class="row">
                <aside class="col-md-16">
                    <div class="widget categories">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="single_comments">
                                <g:if test="${flightClassInstance?.airline}">	
                                    <a>Aeorlínea: </a>
                                    <br>&emsp;&emsp;&emsp;<g:link class="cLink" controller="airline" action="show" id="${flightClassInstance?.airline?.id}">${flightClassInstance?.airline?.name}</g:link>
                                </g:if>
                            </div> 
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.individualTv}">
                                    <a>Tv Individual: </a>
                                    <g:checkBox name="individualTv" value="${flightClassInstance?.individualTv}" disabled="tue" />

                                </g:if>
                            </div>
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.overWeightLuggage}">
                                    <a>Over Weight Luggage: </a>
                                    <g:checkBox name="overWeightLuggage" value="${flightClassInstance?.overWeightLuggage}" disabled="tue" />

                                </g:if>
                            </div>
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.snacks}">
                                    <a>Snacks: </a>
                                    <g:checkBox name="snacks" value="${flightClassInstance?.snacks}" disabled="tue" />

                                </g:if>
                            </div>
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.vipRoom}">
                                    <a>Vip Room: </a>
                                    <g:checkBox name="vipRoom" value="${flightClassInstance?.vipRoom}" disabled="tue" />

                                </g:if>
                            </div>
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.wifi}">
                                    <a>Wifi: </a>
                                    <g:checkBox name="wifi" value="${flightClassInstance?.wifi}" disabled="tue" />

                                </g:if>
                            </div>
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.type}">
                                    <a>Tipo: </a>
                                    <g:fieldValue bean="${flightClassInstance}" field="type"/>
                                </g:if>
                            </div>
                            <div class="single_comments">
                                <g:if test="${flightClassInstance?.multiplier}">
                                    <a>Multiplicador: </a>
                                    <g:fieldValue bean="${flightClassInstance}" field="multiplier"/>
                                </g:if>
                            </div>
                            <center>
                                <section id="contact-page">
                                    <div class="container">
                                        <div class="row contact-wrap"> 
                                            <div class="col-sm-5 col-sm-offset-1">                   
                                                <div class="form-group">
                                                    <ul class="nav navbar-nav">  
                                                        <li><g:form  action="edit" resource="${flightClassInstance}">
                                                                <button type="submit" class="btn btn-primary btn-lg">Editar</button>
                                                            </g:form>
                                                        </li>
                                                        <li>
                                                            <g:form url="[resource:flightClassInstance, action:'delete']" method="DELETE">
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