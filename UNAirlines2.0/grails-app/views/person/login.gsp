<%@ page import="unairlines2.Person" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Iniciar sesi&oacute;n</title>

    <asset:stylesheet src="bootstrap.min.css" />
    <asset:stylesheet src="font-awesome.min.css" />
    <asset:stylesheet src="animate.min.css" />
    <asset:stylesheet src="prettyPhoto.css" />
    <asset:stylesheet src="main.css" />
    <asset:stylesheet src="responsive.css" />
    <asset:javascript src="jquery.js" />
    <asset:javascript src="bootstrap.min.js" />
    <asset:javascript src="jquery.prettyPhoto.js" />
    <asset:javascript src="jquery.isotope.min.js" />
    <asset:javascript src="main.js" />
    <asset:javascript src="wow.min.js" />

    <asset:stylesheet src="base.css" />
    <asset:stylesheet src="skeleton.css" />
    <asset:stylesheet src="layout.css" />

</head>
<body class="homepage">
    <header id="header">
        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src="${resource(dir: 'images', file: 'logo.png')}" alt="logo"/></a>
                </div>

                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <!--<li class="active"><a href="index.html">Home</a></li>-->

                        <li class="active">                    
                            <g:form controller="Customer" action="create" method="post">
                                <button type="submit" class="btn btn-primary btn-lg">Registrarse</button>
                            </g:form>
                        </li>
                        <li class="active">
                            <g:form controller="Person" action="login" method="post">
                                <button type="submit" class="btn btn-primary btn-lg">Iniciar Sesi&oacute;n</button>
                            </g:form>
                            </</li>                       
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
    </header><!--/header-->

    <div id="create-customer" class="content scaffold-create" role="main">
        <div class="form-bg">
            <g:form controller="Person" action="doLogin" method="post">
                <h2>Iniciar Sesi&oacute;n</h2>
                <p><center>${flash.message}</center></p>
                <p><input name="email" type="text" placeholder="E-mail"></p>
                <p><input name="password" type="password" placeholder="Clave"></p>
                <center><button type="submit" class="btn btn-primary btn-lg">Entrar</button></center>
            </g:form>
        </div>

    </div><!-- container -->


</body>
</html>