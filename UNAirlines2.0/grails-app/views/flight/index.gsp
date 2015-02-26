
<%@ page import="unairlines2.Flight" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'flight.label', default: 'Flight')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-flight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-flight" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="arrivalDate" title="${message(code: 'flight.arrivalDate.label', default: 'Arrival Date')}" />
					
						<g:sortableColumn property="cost" title="${message(code: 'flight.cost.label', default: 'Cost')}" />
					
						<g:sortableColumn property="departureDate" title="${message(code: 'flight.departureDate.label', default: 'Departure Date')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'flight.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="destination" title="${message(code: 'flight.destination.label', default: 'Destination')}" />
					
						<g:sortableColumn property="gate" title="${message(code: 'flight.gate.label', default: 'Gate')}" />
					
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
	</body>
</html>
