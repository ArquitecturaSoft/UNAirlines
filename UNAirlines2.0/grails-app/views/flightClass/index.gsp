
<%@ page import="unairlines2.FlightClass" %>

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
		<g:set var="entityName" value="${message(code: 'flightClass.label', default: 'FlightClass')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<header id="header">
                <g:render template="/common/menuA" />
            </header>
            <div class="table-title">
                <h3>Lista de Categorias</h3><br>
            </div>
            <center><table class="table-fill">
                <thead>
                    <tr>
                        <th class="text-center">Aerolinea</th>
                        <th class="text-center">Tv Individual</th>
                        <th class="text-center">Over Weight Luggage</th>
                        <th class="text-center">Snacks</th>
                        <th class="text-center">Vip Room</th>
                        <th class="text-center">Wifi</th>
                        <th class="text-center">Tipo</th>
                        <th class="text-center">Multiplicador</th>
                    </tr>
                </thead>
		<div id="list-flightClass" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<tbody class="table-hover">
                    <g:each in="${flightClassInstanceList}" status="i" var="flightClassInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td class="text-center"><g:link action="show" id="${flightClassInstance.id}">${fieldValue(bean: flightClassInstance, field: "airline")}</g:link></td>
					
						<td class="text-center"><g:formatBoolean boolean="${flightClassInstance.individualTv}" /></td>
                                                
                                                <td class="text-center"><g:formatBoolean boolean="${flightClassInstance.overWeightLuggage}" /></td>
				
						<td class="text-center"><g:formatBoolean boolean="${flightClassInstance.snacks}" /></td>
                                                
                                                <td class="text-center"><g:formatBoolean boolean="${flightClassInstance.vipRoom}" /></td>
                                                
                                                <td class="text-center"><g:formatBoolean boolean="${flightClassInstance.wifi}" /></td>
					
						<td class="text-center">${fieldValue(bean: flightClassInstance, field: "type")}</td>
                                                
                                                <td class="text-center">${fieldValue(bean: flightClassInstance, field: "multiplier")}</td>
					
					</tr>
				</g:each>
                </tbody>
            </table>  
    <br>
    
        <g:form controller="flightClass" action="create">
        
            <button type="submit" class="btn btn-primary btn-lg">Crear Categoria</button></li>
        
        </g:form>
      </center>     
    <br>
    </body>
    </html>
		
				
