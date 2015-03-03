<%@ page import="unairlines2.FlightClass" %>

<section id="contact-page">
        <div class="container">
            <div class="row contact-wrap"> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                    <div class="col-sm-5 col-sm-offset-1">
                       <div class="form-group">
                            <label>Aerolinea*</label>
                            <g:select id="airline" name="airline.id" from="${unairlines2.Airline.list()}" optionKey="id" required="" value="${flightClassInstance?.airline?.id}" class="many-to-one"/>
                        </div>
                        <div class="form-group">
                            <label>Tv Individual</label>
                            <g:checkBox name="individualTv" value="${flightClassInstance?.individualTv}" />
                        </div>
                        <div class="form-group">
                            <label>Over Weight Luggage</label>
                             <g:checkBox name="overWeightLuggage" value="${flightClassInstance?.overWeightLuggage}" />
                        </div>
                        <div class="form-group">
                            <label>Snacks</label>
                            <g:checkBox name="snacks" value="${flightClassInstance?.snacks}" />
                        </div>                        
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label>VIP Room</label>
                            <g:checkBox name="vipRoom" value="${flightClassInstance?.vipRoom}" />
                        </div>
                        <div class="form-group">
                            
                            <label>Wifi</label>
                            <g:checkBox name="wifi" value="${flightClassInstance?.wifi}" />
                        </div>
                        <div class="form-group">
                            <label>Tipo</label>
                            <input type="text" name="type" class="form-control" value="${flightClassInstance?.type}" required="" >
                        </div>
                        <div class="form-group">
                            <label>Multiplicador*</label>
                            <input type="text" name="multiplier" class="form-control" value="${fieldValue(bean: flightClassInstance, field: 'multiplier')}" required="" >
                        </div>
                    </div>
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->
