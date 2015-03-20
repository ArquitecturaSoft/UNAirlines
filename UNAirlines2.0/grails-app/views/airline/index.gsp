
<%@ page import="unairlines2.Airline" %>
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
    <g:set var="entityName" value="${message(code: 'airline.label', default: 'Airline')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
	<body>
            <header id="header">
                <g:if test="${session.isAdmin == true}">
                    <g:render template="/common/menuA" />
                </g:if>
                <g:if test="${session.isCustomer == true}">
                    <g:render template="/common/menu" />
                </g:if>
            </header>
            <div class="table-title">
                <h3>Lista de Aerolíneas</h3><br>
            </div>
            <center><table class="table-fill">
                <thead>
                    <tr>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Dirección</th>                        
                        <th class="text-center">Telefono</th>

                    </tr>
                </thead>
		<tbody class="table-hover">
                    <g:each in="${airlineInstanceList}" status="i" var="airlineInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                            
                            <td class="text-center">
                        
                        <g:if test="${session.isAdmin == true}"><g:link action="show" id="${airlineInstance.id}">${fieldValue(bean: airlineInstance, field: "name")}</g:link></g:if>
                        <g:if test="${session.isCustomer == true}">${fieldValue(bean: airlineInstance, field: "name")}</g:if>
                            </td>

                            <td class="text-center">${fieldValue(bean: airlineInstance, field: "address")}</td>

                            <td class="text-center">${fieldValue(bean: airlineInstance, field: "phone")}</td>

                        </tr>
                    </g:each>
                </tbody>
            </table>
        <br>
        <g:if test="${session.isAdmin == true}">
        <g:form controller="airline" action="create">
            <button type="submit" class="btn btn-primary btn-lg">Crear Aerolinea</button></li>
        </g:form> 
        </g:if>  </center>        
    <br>

    </body>
    </html>
