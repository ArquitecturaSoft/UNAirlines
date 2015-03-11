<%@ page import="unairlines2.Flight" %>
<!DOCTYPE html>
<html>
    < <head>
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
    <title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>
<body>
    <header id="header">
        <g:render template="/common/menu" />
    </header>
    <section id="about-us">
        <div class="container">                
            </div> <!--skill_border-->    
            <center><h1><a>Buscar Vuelo<a></h1></center>
            <center>
                <div class="row clearfix plan1">
                    <div class="col-md-4 col-sm-6">	
                        <div class="single-profile-top wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
                            <div class="media">
                                <div class="media-body">
                                    <br>
                                    <h2>Ciudad De Origen:</h2>
                                    <g:form class="simpleform" url="[controller:'Flight', action:'doSearch']" >
                                    <g:select name="originCity" value="originCity" from="${originCities}"/>
                                    <br><br>
                                    <h2>Ciudad Destino:</h2>
                                    <g:select name="destinationCity" value="destinationCity" from="${destinationCities}"/>
                                    <br><br>
                                    <h2>Fecha:</h2>
                                    <input type=date step=7 min="${new Date()}">
                                    <br>
                        <button type="submit" name="search" class="btn btn-primary btn-lg" value="Buscar" >Buscar</button>                          
                </g:form>
                                </div>
                            </div><!--/.media -->
                        </div>
                    </div><!--/.col-lg-4 -->                 
                </body>
                </html>
