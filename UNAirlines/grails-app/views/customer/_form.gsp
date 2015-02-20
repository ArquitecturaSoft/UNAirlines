<%@ page import="unairlines.Customer" %>

<section id="contact-page">
        <div class="container">
            <div class="center">        
                <h2>Formulario de Registro</h2>
                <p class="lead">Por favor, diligencia la siguiente información.</p>
            </div> 
            <div class="row contact-wrap"> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                    <div class="col-sm-5 col-sm-offset-1">
                        <div class="form-group">
                            <label>Name *</label>
                            <input type="text" name="name" class="form-control" required="required" value="${customerInstance?.name}">
                            
                        </div>
                        <div class="form-group">
                            <label>Surname *</label>
                            <input type="text" name="surname" class="form-control"  required="required" value="${customerInstance?.surname}">
                        </div>
                        <div class="form-group">
                            <label>Email*</label>
                            <input type="text" name="email" class="form-control" required="required" value="${customerInstance?.email}" >  
                        </div>
                        <div class="form-group">
                            <label>Password*</label>
                            <input type="text" name="password" class="form-control" required="required" value="${customerInstance?.password}" >  
                        </div>                        
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label>Address</label>
                            
                            <input type="text" name="address" class="form-control" required="" value="${customerInstance?.address}" >  
                        </div>
                        <div class="form-group">
                            
                            <label>Phone*</label>
                            <input type="text" name="phone" required="" class="form-control" value="${customerInstance?.phone}">
                        </div>                          
                    </div>
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->
    
    


	
		
	
	




	










