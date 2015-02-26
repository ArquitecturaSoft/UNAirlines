
<%@ page import="unairlines2.Airline" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'airline.label', default: 'Airline')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-airline" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-airline" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="address" title="${message(code: 'airline.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'airline.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="phone" title="${message(code: 'airline.phone.label', default: 'Phone')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${airlineInstanceList}" status="i" var="airlineInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${airlineInstance.id}">${fieldValue(bean: airlineInstance, field: "address")}</g:link></td>
					
						<td>${fieldValue(bean: airlineInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: airlineInstance, field: "phone")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${airlineInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
