
<%@ page import="unairlines2.Customer" %>
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
		<g:set var="entityName" value="${message(code: 'customer.label', default: 'Customer')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<header id="header">
                <g:render template="/common/menuA" />
            </header>
            <div class="table-title">
                <h3>Lista de Clientes</h3><br>
            </div>
            <center><table class="table-fill">
                <thead>
                    <tr>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Correo Electronico</th>
                        <th class="text-center">Contraseña</th>
                        <th class="text-center">Direccion</th>
                        <th class="text-center">Telefono</th>
                    </tr>
                </thead>
                <tbody class="table-hover">
                    <g:each in="${customerInstanceList}" status="i" var="customerInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td class="text-center"><g:link action="show" id="${customerInstance.id}">${fieldValue(bean: customerInstance, field: "name")}</g:link></td>
					
						<td class="text-center">${fieldValue(bean: customerInstance, field: "surname")}</td>
					
						<td class="text-center">${fieldValue(bean: customerInstance, field: "email")}</td>
					
						<td class="text-center">${fieldValue(bean: customerInstance, field: "password")}</td>
					
						<td class="text-center">${fieldValue(bean: customerInstance, field: "address")}</td>
					
						<td class="text-center">${fieldValue(bean: customerInstance, field: "phone")}</td>
					
					</tr>
				</g:each>
                </tbody>
            </table>  
    <br>

    </body>
    </html>
		