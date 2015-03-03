<%@ page import="unairlines2.Airline" %>



<section id="contact-page">
    <div class="container">
        <div class="row contact-wrap"> 
            <div class="status alert alert-success" style="display: none"></div>
            <form id="main-contact-form" class="contact-form" name="contact-form" method="post">
                <div class="col-sm-5 col-sm-offset-1">
                    <div class="form-group">
                        <label>Direccion*</label>
                        <input type="text" name="address" class="form-control" required="required" value="${airlineInstance?.address}">
                    </div>
                    <div class="form-group">
                        <label>Clase de Vuelo</label>
                        <ul class="one-to-many">
                            <g:each in="${airlineInstance?.flightClasses?}" var="f">
                                <li><g:link controller="flightClass" action="show" id="${f.id}">${f?.encodeAsHTML()}</g:link></li>
                                </g:each>
                            <li class="add">
                                <g:link controller="flightClass" action="create" params="['airline.id': airlineInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'flightClass.label', default: 'FlightClass')])}</g:link>
                                </li>
                            </ul>
                        </div>
                        
                    <div class="form-group">
                        <label>Nombre*</label>
                        <input type="text" name="name" class="form-control"  required="" value="${airlineInstance?.name}">
                    </div>
                    <div class="form-group">
                        <label>Telefono*</label>
                        <input type="text" name="phone" class="form-control" required="" value="${airlineInstance?.phone}" >  
                    </div>
                </div>
        </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#contact-page-->                   