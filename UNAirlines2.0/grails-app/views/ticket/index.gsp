
<%@ page import="unairlines2.Ticket" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ticket.label', default: 'Ticket')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-ticket" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-ticket" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="code" title="${message(code: 'ticket.code.label', default: 'Code')}" />
					
						<th><g:message code="ticket.flight.label" default="Flight" /></th>
					
						<g:sortableColumn property="passengerBirthDate" title="${message(code: 'ticket.passengerBirthDate.label', default: 'Passenger Birth Date')}" />
					
						<g:sortableColumn property="passengerID" title="${message(code: 'ticket.passengerID.label', default: 'Passenger ID')}" />
					
						<g:sortableColumn property="passengerLastName" title="${message(code: 'ticket.passengerLastName.label', default: 'Passenger Last Name')}" />
					
						<g:sortableColumn property="passengerName" title="${message(code: 'ticket.passengerName.label', default: 'Passenger Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${ticketInstanceList}" status="i" var="ticketInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${ticketInstance.id}">${fieldValue(bean: ticketInstance, field: "code")}</g:link></td>
					
						<td>${fieldValue(bean: ticketInstance, field: "flight")}</td>
					
						<td><g:formatDate date="${ticketInstance.passengerBirthDate}" /></td>
					
						<td>${fieldValue(bean: ticketInstance, field: "passengerID")}</td>
					
						<td>${fieldValue(bean: ticketInstance, field: "passengerLastName")}</td>
					
						<td>${fieldValue(bean: ticketInstance, field: "passengerName")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${ticketInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
