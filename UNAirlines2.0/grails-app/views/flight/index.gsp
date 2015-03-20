
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
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
    

	<body>
            <header id="header">
        <g:render template="/common/menuA" />
    </header>
    <br><br>
    <center><table class="table-fill">
        <thead>
            <tr>
                <th class="text-center">Aerolínea</th>
                <th class="text-center">Fecha de Partida</th>
                <th class="text-center">Fecha de Llegada</th>
                <th class="text-center">Ciudad Origen</th>
                <th class="text-center">Ciudad Destino</th>
                <th class="text-center">Precio</th>            
                <th class="text-center">Descripción</th>
                <th class="text-center">Gate</th>
                <th class="text-center">Número</th>
            </tr>
        </thead>
        <tbody class="table-hover">
            <g:each in="${flightInstanceList}" status="i" var="flightInstance">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                    
                    <td class="text-center"><g:link action="show" id="${flightInstance.id}">${fieldValue(bean: flightInstance, field: "airline.name")}</g:link></td>                   
                    
                    <td class="text-center"><g:formatDate date="${flightInstance.departureDate}" /></td>

                    <td class="text-center"><g:formatDate date="${flightInstance.arrivalDate}" /></td>
                    
                    <td class="text-center">${fieldValue(bean: flightInstance, field: "origin")}</td>
                    
                    <td class="text-center">${fieldValue(bean: flightInstance, field: "destination")}</td>
                    
                    <td class="text-center">${fieldValue(bean: flightInstance, field: "cost")}</td>                    

                    <td class="text-center">${fieldValue(bean: flightInstance, field: "description")}</td>                    

                    <td class="text-center">${fieldValue(bean: flightInstance, field: "gate")}</td>

                    <td class="text-center">${fieldValue(bean: flightInstance, field: "numberFlight")}</td>
                </tr>
            </g:each>
        </tbody>
    </table>
<br>
    <g:form controller="flight" action="create">
        <button type="submit" class="btn btn-primary btn-lg">Crear Vuelo</button></li>
    </g:form>	</center>	
</body>
</html>

    
		
	