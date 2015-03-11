
<%@ page import="unairlines2.Ticket" %>
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
		<g:set var="entityName" value="${message(code: 'ticket.label', default: 'Ticket')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<header id="header">
        <g:render template="/common/menu" />
    </header>
    <br><br>
    <div class="table-title">
                <h3>Mis vuelos</h3><br>
            </div>
    <center><table class="table-fill">
        <thead>
            <tr>
                <th class="text-center">Código</th>
                <th class="text-center">Vuelo</th>
                <th class="text-center">Fecha de Nacimiento del Pasajero</th>
                <th class="text-center">Id del Pasajero</th>
                <th class="text-center">Apellidos del Pasajero</th>
                <th class="text-center">Nombres del Pasajero</th>
                <th class="text-center">Precio</th>
                <th class="text-center">Silla</th>
            </tr>
        </thead>
        <tbody class="table-hover">
            <g:each in="${ticketInstanceList}" status="i" var="ticketInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td class="text-center">${fieldValue(bean: ticketInstance, field: "code")}</td>
					
						<td class="text-center">${fieldValue(bean: ticketInstance, field: "flight.numberFlight")}</td>
					
						<td class="text-center"><g:formatDate date="${ticketInstance.passengerBirthDate}" /></td>
					
						<td class="text-center">${fieldValue(bean: ticketInstance, field: "passengerID")}</td>
					
						<td class="text-center">${fieldValue(bean: ticketInstance, field: "passengerLastName")}</td>
					
						<td class="text-center">${fieldValue(bean: ticketInstance, field: "passengerName")}</td>
                                                
                                                <td class="text-center">${fieldValue(bean: ticketInstance, field: "price")}</td>
                                                
                                                <td class="text-center">${fieldValue(bean: ticketInstance, field: "seat")}</td>
					
					</tr>
				</g:each>
        </tbody>
    </table>
	</center>	
</body>
</html>
        
		
					
				