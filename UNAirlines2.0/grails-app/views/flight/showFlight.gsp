
<%@ page import="unairlines2.Flight" %>
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
    <asset:stylesheet src="table.css" />
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
        <g:render template="/common/menu" />
    </header>
    <section class="pricing-page">
        <div class="container">
            <div class="center">  
<div class="pricing-area text-center">
                <div class="row">
                    <div class="col-sm-4 plan price-one wow fadeInDown">
                        <ul>
                            <li class="heading-one">
                                <h1>
                                    <g:if test="${flightInstance?.airline}">
                                        ${flightInstance?.airline?.name}
                                    </g:if>
                                </h1>
                                <span>$${(long)(flightInstance.cost * multiplier)}</span>
                            </li>
                            <li>Fecha de Partida: <g:formatDate date="${flightInstance?.departureDate}" /></li>
                            <li>Fecha de Llegada: <g:formatDate date="${flightInstance?.arrivalDate}" /></li>
                            <li>Descripción: <g:fieldValue bean="${flightInstance}" field="description"/></li>
                            <li>Ciudad de Origen: <g:fieldValue bean="${flightInstance}" field="origin"/></li>
                            <li>Ciudad de Destino: <g:fieldValue bean="${flightInstance}" field="destination"/></li>
                            <li>Gate: <g:fieldValue bean="${flightInstance}" field="gate"/></li>
                            <li>Número de Vuelo: <g:fieldValue bean="${flightInstance}" field="numberFlight"/></li>
                            
                            <li class="plan-action">
                                <g:form controller="ticket" action="create" >
                                    <g:hiddenField name="flightID" value="${flightInstance.id}" />
                                    <g:hiddenField name="categoryID" value="${rCategory.id}" />
                                    <div class="form-group">
                                        <button type="submit" name="buy" class="btn btn-primary btn-lg" >Comprar</button>
                                    </div>
                                </g:form>
                            </li>
                        </ul>
                    </div>
                    <div class="col-sm-4 plan price-two wow fadeInDown">
                        <ul>
                            <li class="heading-two">
                                <h1>
                                    ¿Que beneficios tienes con la categoría ${rCategory.type}?
                                </h1>
                            </li>
                            <li>Wifi: <g:checkBox name="wifi" value="${rCategory.wifi}" disabled="true" />
                            <li>Tv Individual: <g:checkBox name="IndividualTv" value="${rCategory.individualTv}" disabled="true" />
                            <li>Snacks: <g:checkBox name="snacks" value="${rCategory.snacks}" disabled="true" />
                            <li>Vip Room: <g:checkBox name="vipRoom" value="${rCategory.vipRoom}" disabled="true" />
                            <li>Over Weight Luggage: <g:checkBox name="verWeightLuggage" value="${rCategory.overWeightLuggage}" disabled="true" />
                            
                        </ul>
                    </div>
            </div>                     
                                  </div>
            </div><!--/pricing-area-->
        </div><!--/container-->
    </section><!--/pricing-page-->
</body>
</html>
