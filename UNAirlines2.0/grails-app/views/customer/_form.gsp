<%@ page import="unairlines2.Customer" %>
<section id="contact-page">
        <div class="container">
            <div class="row contact-wrap"> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                    <div class="col-sm-5 col-sm-offset-1">
                       <div class="form-group">
                            <label>Nombre *</label>
                            <input type="text" name="name" class="form-control" required="" value="${customerInstance?.name}">
                        </div>
                        <div class="form-group">
                            <label>Apellido *</label>
                            <input type="text" name="surname" class="form-control"  required="" value="${customerInstance?.surname}">
                        </div>
                        <div class="form-group">
                            <label>Correo Electronico*</label>
                            <input type="text" name="email" class="form-control" required="" value="${customerInstance?.email}" >  
                        </div>
                        <div class="form-group">
                            <label>Contraseña*</label>
                            <input type="password" name="password" class="form-control" required="" value="${customerInstance?.password}" >  
                        </div>                        
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label>Direccion</label>
                            
                            <input type="text" name="address" class="form-control" required="" value="${customerInstance?.address}" >  
                        </div>
                        <div class="form-group">
                            
                            <label>Telefono*</label>
                            <input type="text" name="phone" required="" class="form-control" value="${customerInstance?.phone}">
                        </div>
                        
                    </div>
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->
