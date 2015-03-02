<%@ page import="unairlines2.Admin" %>
<section id="contact-page">
    <div class="container">
        <div class="row contact-wrap"> 
            <div class="status alert alert-success" style="display: none"></div>
            <form id="main-contact-form" class="contact-form" name="contact-form" method="post">
                <div class="col-sm-5 col-sm-offset-1">
                    <div class="form-group">
                        <label>Nombre*</label>
                        <input type="text" name="name" class="form-control" required="" value="${adminInstance?.name}">
                    </div>
                    <div class="form-group">
                        <label>Apellido*</label>
                        <input type="text" name="surname" class="form-control" required="" value="${adminInstance?.surname}">
                    </div>
                    <div class="form-group">
                        <label>Correo Electronico*</label>
                        <input type="email" name="email" class="form-control" required="" value="${adminInstance?.email}">
                    </div>
                    <div class="form-group">
                        <label>Contraseña*</label>
                        <input type="password" name="password" class="form-control" required="" value="${adminInstance?.password}">
                    </div>
                </div>
        </div><!--/.row-->
    </div><!--/.container-->
</section><!--/#contact-page-->       