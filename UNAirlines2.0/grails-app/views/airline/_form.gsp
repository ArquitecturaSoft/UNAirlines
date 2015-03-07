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