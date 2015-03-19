
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
		
			
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<tbody class="table-hover">
                    <g:each in="${flightClassInstanceList}" status="i" var="flightClassInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td class="text-center"><g:link action="show" id="${flightClassInstance.id}">${fieldValue(bean: flightClassInstance, field: "airline.name")}</g:link></td>
                                                                        
						<td class="text-center"><g:checkBox name="iTv" value="${flightClassInstance.individualTv}" disabled="true" /></td>
                                                                        
                                                <td class="text-center"><g:checkBox name="owl" value="${flightClassInstance.overWeightLuggage}" disabled="true" /></td>
				
						<td class="text-center"><g:checkBox name="snk" value="${flightClassInstance.snacks}" disabled="true" /></td>
                                                
                                                <td class="text-center"><g:checkBox name="vip" value="${flightClassInstance.vipRoom}" disabled="true" /></td>
                                                
                                                <td class="text-center"><g:checkBox name="wifi" value="${flightClassInstance.wifi}" disabled="true" /></td>
					
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
		
				
