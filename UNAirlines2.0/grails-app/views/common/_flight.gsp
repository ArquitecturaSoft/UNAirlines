
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
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>

    <section id="content" class="shortcode-item">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-17">
                    <div id="list-flight" class="content scaffold-list" role="main">
                        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
                        <g:if test="${flash.message}">
                            <div class="message" role="status">${flash.message}</div>
                        </g:if>
                        <table>
                            <thead>
                                <tr>

                                    <g:sortableColumn property="arrivalDate" title="${message(code: 'flight.arrivalDate.label', default: 'Arrival Date')}" />

                                    <g:sortableColumn property="departureDate" title="${message(code: 'flight.departureDate.label', default: 'Departure Date')}" />
                                    
                                    <g:sortableColumn property="destination" title="${message(code: 'flight.destination.label', default: 'Destination')}" />

                                    <g:sortableColumn property="cost" title="${message(code: 'flight.cost.label', default: 'Cost')}" />

                                    <g:sortableColumn property="gate" title="${message(code: 'flight.gate.label', default: 'Gate')}" />

                                    <g:sortableColumn property="description" title="${message(code: 'flight.description.label', default: 'Description')}" />

                                </tr>
                            </thead>
                            <tbody>
                                <g:each in="${flightInstanceList}" status="i" var="flightInstance">
                                    <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                                        <td><g:link action="show" id="${flightInstance.id}">${fieldValue(bean: flightInstance, field: "arrivalDate")}</g:link></td>

                                        <td>${fieldValue(bean: flightInstance, field: "cost")}</td>

                                        <td><g:formatDate date="${flightInstance.departureDate}" /></td>

                                        <td>${fieldValue(bean: flightInstance, field: "description")}</td>

                                        <td>${fieldValue(bean: flightInstance, field: "destination")}</td>

                                        <td>${fieldValue(bean: flightInstance, field: "gate")}</td>

                                    </tr>
                                </g:each>
                            </tbody>
                        </table>
                        <div class="pagination">
                            <g:paginate total="${flightInstanceCount ?: 0}" />
                        </div>
                    </div>



                
    </div>
</div><!--/.row-->
</div><!--/.container-->
</section><!--/#content-->

</body>
</html>
