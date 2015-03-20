<%@ page import="unairlines2.Flight" %>
<section id="contact-page">
    <div class="container">
        <div class="row contact-wrap"> 
            <div class="status alert alert-success" style="display: none"></div>
            <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                <div class="col-sm-5 col-sm-offset-1">
                    <div class="form-group">                         
                        <label>Aerolínea*</label>
                        <g:select id="airline" name="airline.id" from="${unairlines2.Airline.list()}" optionKey="id" required="" value="${flightInstance?.airline?.id}"  optionValue="name" class="many-to-one"/>  
                    </div>
                    
                    <div class="form-group">
                        <label>Precio *</label>
                        <input type="text" name="cost" class="form-control" value="${fieldValue(bean: flightInstance, field: 'cost')}" required="" >
                    </div>
                    <div class="form-group">
                        <label>Fecha de Partida*</label>
                        <g:datePicker name="departureDate" precision="minute"  value="${flightInstance?.departureDate}"  />
                    </div>
                    <div class="form-group">

                        <label>Fecha de Llegada*</label>
                        <g:datePicker name="arrivalDate" precision="minute"  value="${flightInstance?.arrivalDate}"  />

                    </div>
                    <div class="form-group"> 
                        <label>Número de Vuelo*</label>
                        <input type="text" name="numberFlight" required="" class="form-control" value="${flightInstance?.numberFlight}">
                    </div> 
                    
                                       
                </div>
                <div class="col-sm-5">
                    <div class="form-group"> 
                        <label>Ciudad de Origen*</label>
                        <input type="text" name="origin" required="" class="form-control" value="${flightInstance?.origin}">
                    </div> 
                    <div class="form-group">
                        <label>Ciudad de Destino*</label>                            
                        <input type="text" name="destination" class="form-control" required="" value="${flightInstance?.destination}" >  
                    </div>
                    <div class="form-group"> 
                        <label>Gate*</label>
                        <input type="text" name="gate" required="" class="form-control" value="${flightInstance?.gate}">
                    </div>
                    
                    <div class="form-group">
                        <label>Descripción*</label>
                        <input type="text" name="description" class="form-control" required="" value="${flightInstance?.description}">  
                    </div>     
                    </div>
            </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#contact-page-->