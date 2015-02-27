<%@ page import="unairlines2.Flight" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'flight.label', default: 'Flight')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#edit-flight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
                <g:form class="simpleform" url="[controller:'Flight', action:'doSearch']" >
                    <div id="search-flight" class="search" role="main">
                            <h1>Buscar vuelo</h1>
                            <g:select name="originCity" value="originCity" from="${originCities}"/>
                            <g:select name="destinationCity" value="destinationCity" from="${destinationCities}"/>
                            <br>
                            <g:datePicker name="departureDate" value="${new Date()}" precision="day" years="${(1900 + new Date().year)..(1900 + new Date().year + 1)}"/>
                            <br>
                            <g:submitButton name="search" class="search" value="BUSCAR" />
                    </div>
                </g:form>
	</body>
</html>
