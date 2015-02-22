
<%@ page import="unairlines.Flight" %>
<!DOCTYPE html>
<html>
	<head>
            <asset:stylesheet src="bootstrap.min.css" />
            <asset:stylesheet src="font-awesome.min.css"/>
            <asset:stylesheet src="animate.min.css"/>
            <asset:stylesheet src="prettyPhoto.css"/>
            <asset:stylesheet src="main.css"/>
            <asset:stylesheet src="responsive.css"/>

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
        <g:render template="/common/menuA" />
    </header>
    <section id="content" class="shortcode-item">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-17">
                    <h2>Panel de Administrador</h2> 
                    <div class="tab-wrap">
                        <div class="media">
                            <g:render template="/common/leftPanel" />
                            <div class="parrent media-body">
                                <div class="tab-content">
                                    <div class="tab-pane" id="tab1">
                                        hola1
                                    </div>
                                    <div class="tab-pane" id="tab2">
                                        hola2
                                    </div>
                                    <div class="tab-pane" id="tab3">
                                        hola3
                                    </div>
                                    <div class="tab-pane" id="tab4">
                                        hola4
                                    </div>
                                    <div class="tab-pane" id="tab5">
                                        hol5
                                    </div>
                                    <div class="tab-pane" id="tab6">
                                        hola6
                                    </div>
                                </div> <!--/.tab-content-->  
                            </div> <!--/.media-body--> 
                        </div> <!--/.media-->     
                    </div><!--/.tab-wrap-->               
                </div><!--/.col-sm-6-->
            </div>
        </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#content-->






 <a href="#list-flight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
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
