<%@ page import="unairlines2.Flight" %>
<section id="contact-page">
    <div class="container">
        <div class="row contact-wrap"> 
            <div class="status alert alert-success" style="display: none"></div>
            <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                <div class="col-sm-5 col-sm-offset-1">
                    <div class="form-group">                         
                        <label>Aerolinea*</label>
                        <g:select id="airline" name="airline.id" from="${unairlines2.Airline.list()}" optionKey="id" required="" value="${flightInstance?.airline?.id}" class="many-to-one"/>  
                    </div>
                    <div class="form-group">

                        <label>Fecha de Arribo*</label>
                        <g:datePicker name="arrivalDate" precision="day"  value="${flightInstance?.arrivalDate}"  />

                    </div>
                    <div class="form-group">
                        <label>Precio *</label>
                        <input type="text" name="cost" class="form-control" value="${fieldValue(bean: flightInstance, field: 'cost')}" required="" >
                    </div>
                    <div class="form-group">
                        <label>Fecha de Partida*</label>
                        <g:datePicker name="departureDate" precision="day"  value="${flightInstance?.departureDate}"  />
                    </div>
                    <div class="form-group">
                        <label>Descripcion*</label>
                        <input type="text" name="description" class="form-control" required="" value="${flightInstance?.description}">  
                    </div>                        
                </div>
                <div class="col-sm-5">
                    <div class="form-group">
                        <label>Destino*</label>                            
                        <input type="text" name="destination" class="form-control" required="" value="${flightInstance?.destination}" >  
                    </div>
                    <div class="form-group"> 
                        <label>Puerta*</label>
                        <input type="text" name="gate" required="" class="form-control" value="${flightInstance?.gate}">
                    </div>
                    <div class="form-group"> 
                        <label>Numero de Vuelo*</label>
                        <input type="text" name="numberFlight" required="" class="form-control" value="${flightInstance?.numberFlight}">
                    </div> 
                    <div class="form-group"> 
                        <label>Ciudad de Origen*</label>
                        <input type="text" name="origin" required="" class="form-control" value="${flightInstance?.origin}">
                    </div> 
                    <div class="form-group"> 
                        <label>Tiquetes</label>
                        <ul class="one-to-many">
                            <g:each in="${flightInstance?.tickets?}" var="t">
                                <li><g:link controller="ticket" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
                                </g:each>
                            <li class="add">
                                <g:link controller="ticket" action="create" params="['flight.id': flightInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'ticket.label', default: 'Ticket')])}</g:link>
                                </li>
                            </ul>
                        </div>
                    </div>
            </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#contact-page-->