<%@ page import="unairlines2.Ticket" %>

<section id="contact-page">
        <div class="container">
            <div class="row contact-wrap"> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                    <div class="col-sm-5 col-sm-offset-1">
                        <div class="form-group">
                            <label>Codigo*</label>
                            <input type="text" name="code" class="form-control" required="" value="${ticketInstance?.code}">
                        </div>
                        <div class="form-group">
                            <label>Vuelo*</label>
                            <g:select id="flight" name="flight.id" from="${unairlines2.Flight.list()}" optionKey="id" required="" value="${ticketInstance?.flight?.id}" class="many-to-one"/>
                        </div>
                        <div class="form-group">
                            <label>Fecha de Naciomiento del Pasajero *</label>
                            <g:datePicker name="passengerBirthDate" precision="day"  value="${ticketInstance?.passengerBirthDate}"  />
                        </div>
                        <div class="form-group">
                            <label>Id Pasajero*</label>
                            <input type="text" name="passengerID" class="form-control" required="" value="${ticketInstance?.passengerID}" >  
                        </div>
                        <div class="form-group">
                            <label>Apellido Pasajero*</label>
                            <input type="text" name="passengerLastName" class="form-control" required="" value="${ticketInstance?.passengerLastName}">  
                        </div> 
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                                <label>Nombre Pasajero*</label>
                                <input type="text" name="passengerName" class="form-control" required="" value="${ticketInstance?.passengerName}" >  
                        </div>
                        <div class="form-group">
                            <label>Precio*</label>
                            <input type="text" name="price" required="" class="form-control" value="${fieldValue(bean: ticketInstance, field: 'price')}">
                        </div>
                        <div class="form-group">
                            <label>Silla*</label>
                            <input type="number" name="seat" required="" class="form-control" value="${ticketInstance.seat}">
                        </div> 
                    </div>
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->


