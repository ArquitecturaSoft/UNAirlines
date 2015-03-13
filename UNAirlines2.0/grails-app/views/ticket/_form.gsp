<%@ page import="unairlines2.Ticket" %>
<section id="contact-page">
    <div class="container">
        <div class="row contact-wrap"> 
            <div class="status alert alert-success" style="display: none"></div>
            <form id="main-contact-form" class="contact-form" name="contact-form" method="post">
                <div class="col-sm-5 col-sm-offset-1">
                    <div class="form-group">
                        <label>Código*</label>
                        <g:textField name="code" required="" value="${newCode}"   readonly="readonly"/>
                    </div>
                    <div class="form-group">
                        <label>Vuelo*</label>
                        <g:textField name="flight.id" required="" value="${flightID}"  readonly="readonly"/>
                    </div>
                    <div class="form-group">
                        <label>Fecha de Nacimiento del Pasajero*</label>
                        <g:datePicker name="passengerBirthDate" precision="day"  value="${ticketInstance?.passengerBirthDate}"  />
                    </div>
                    <div class="form-group">
                        <label>Id del Pasajero*</label>
                        <input type="text" name="passengerID" class="form-control" required="" value="${ticketInstance?.passengerID}">
                    </div>
                    <div class="form-group">
                        <label>Apellidos del Pasajero*</label>
                        <input type="text" name="passengerLastName" class="form-control" required="" value="${ticketInstance?.passengerLastName}">
                    </div>
                    <div class="form-group">
                        <label>Nombres del Pasajero*</label>
                        <input type="text" name="passengerName" class="form-control" required="" value="${ticketInstance?.passengerName}">
                    </div>
                    <div class="form-group">
                        <label>Precio*</label>
                        <g:field name="price" value="${(int)price}" required="" readonly="readonly"/>
                    </div>
                    <div class="form-group">
                        <label>Silla*</label>
                        <g:select name="seat" from="${availableSeats}"/>
                    </div>
                </div>
        </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#contact-page-->
              

