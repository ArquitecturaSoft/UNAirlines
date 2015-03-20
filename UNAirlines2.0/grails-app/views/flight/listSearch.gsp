
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
        <g:render template="/common/menu" />
    </header>
        <br><center><h1><a>Resultados de la Búsqueda</a></h1></center><br>
        <center><table class="table-fill">
        <thead>
            <tr>
                <th class="text-center">Fecha de Partida</th>
                <th class="text-center">Fecha de Llegada</th>               
                <th class="text-center">Origen</th>
                <th class="text-center">Destino</th>
                <th class="text-center">Descripción</th>
                <th class="text-center">Economy</th>
                <th class="text-center">Business</th>
                <th class="text-center">Business Premium</th>
                
            </tr>
        </thead>
	<tbody class="table-hover">  
                    <g:each in="${flightsList}" status="i" var="flightInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                                            
                                            <td class="text-center"><g:formatDate date="${flightInstance.departureDate}" /></td>
                                            
                                            <td class="text-center"><g:formatDate date="${flightInstance.arrivalDate}"  /></td>                                            

                                            <td class="text-center">${fieldValue(bean: flightInstance, field: "origin")}</td>
                                            
                                            <td class="text-center">${fieldValue(bean: flightInstance, field: "destination")}</td>
                                            
                                            <td class="text-center">${fieldValue(bean: flightInstance, field: "description")}</td>

                                            
                                            <g:set var='flag' value='true'/>
                                            <g:each in="${flightInstance.airline.flightClasses.asList()}" status="j" var="categoryInstance">
                                                <g:if test="${categoryInstance.type == "Economy"}">
                                                    <td class="text-center">
                                                        <g:link action="showFlight" id="${flightInstance.id}"  params="[category: 'Economy']">
                                                            ${(long)(flightInstance.cost * categoryInstance.multiplier)}
                                                        </g:link>
                                                    </td>
                                                    <g:set var='flag' value='false'/>
                                                </g:if>
                                            </g:each>
                                            <g:if test="${flag == 'true'}">
                                                <td class="text-center">N/A</td>
                                            </g:if>
                                            
                                            <g:set var='flag' value='true'/>
                                            <g:each in="${flightInstance.airline.flightClasses.asList()}" status="j" var="categoryInstance">
                                                <g:if test="${categoryInstance.type == "Bussines"}">
                                                    <td class="text-center">
                                                        <g:link action="showFlight" id="${flightInstance.id}" params="[category: 'Bussines']">
                                                            ${flightInstance.cost * categoryInstance.multiplier}
                                                        </g:link>
                                                    </td>
                                                    <g:set var='flag' value='false'/>
                                                </g:if>
                                            </g:each>
                                            <g:if test="${flag == 'true'}">
                                                <td class="text-center">N/A</td>
                                            </g:if>
                                            
                                            <g:set var='flag' value='true'/>
                                            <g:each in="${flightInstance.airline.flightClasses.asList()}" status="j" var="categoryInstance">
                                                <g:if test="${categoryInstance.type == "Bussines Premium"}">
                                                    <td class="text-center">
                                                        <g:link action="showFlight" id="${flightInstance.id}" params="[category: 'Bussines Premium']">
                                                            ${flightInstance.cost * categoryInstance.multiplier}
                                                        </g:link>
                                                    </td>
                                                    <g:set var='flag' value='false'/>
                                                </g:if>
                                            </g:each>
                                            <g:if test="${flag == 'true'}">
                                                <td class="text-center">N/A</td>
                                            </g:if>
                                            
					</tr>
				</g:each>               
        </tbody>
    </table>
<br>
</body>
</html>
			
			
				
				
				
