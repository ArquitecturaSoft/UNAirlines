<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Home | UNAirlines</title>
      
        
    <asset:stylesheet src="bootstrap.min.css" />
    <asset:stylesheet src="font-awesome.min.css"/>
    <asset:stylesheet src="animate.min.css"/>
    <asset:stylesheet src="prettyPhoto.css"/>
    <asset:stylesheet src="main.css"/>
    <asset:stylesheet src="responsive.css"/>
    <asset:javascript src="jquery.js" />
    <asset:javascript src="bootstrap.min.js" />
    <asset:javascript src="jquery.prettyPhoto.js" />
    <asset:javascript src="jquery.isotope.min.js" />
    <asset:javascript src="main.js" />
    <asset:javascript src="wow.min.js" />
    
    <!-- <asset:stylesheet src="base.css" />
    <asset:stylesheet src="skeleton.css" />
    <asset:stylesheet src="layout.css" /> -->

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

    <section id="main-slider" class="no-margin">
        <div class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                <li data-target="#main-slider" data-slide-to="1"></li>
                <li data-target="#main-slider" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">

                <div class="item active" style="background-image: url(${resource(dir: 'images', file: 'bg1.jpg')})">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1">Encuentra aquí los Mejores Precios!</h1>
                                    <h2 class="animation animated-item-2">Te mostramos una variedad de precios que se ajusten a tus necesidades!</h2>
                                </div>
                            </div>

                            <div class="col-sm-6 hidden-xs animation animated-item-4">
                                <div class="slider-img">
                                    <img src="${resource(dir: 'images', file: 'img1.png')}" class="img-responsive">
                                </div>
                            </div>

                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(${resource(dir: 'images', file: 'bg2.jpg')})">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1">Tus compras estan a un click!</h1>
                                    <h2 class="animation animated-item-2">Podrar buscar y comprar en linea pasajes al destino que desees!</h2>
                                </div>
                            </div>

                            <div class="col-sm-6 hidden-xs animation animated-item-4">
                                <div class="slider-img">
                                    <img src="${resource(dir: 'images', file: 'img2.png')}" class="img-responsive">
                                </div>
                            </div>

                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(${resource(dir: 'images', file: 'bg3.jpg')})">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1">Que esperas para registrarte?</h1>
                                    <h2 class="animation animated-item-2">Llena el formulario de registro y aprovecha los servicios que te ofrecemos en linea..</h2>

                                </div>
                            </div>
                            <div class="col-sm-6 hidden-xs animation animated-item-4">
                                <div class="slider-img">
                                    <img src="${resource(dir: 'images', file: 'img3.png')}" class="img-responsive">
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!--/.item-->
            </div><!--/.carousel-inner-->
        </div><!--/.carousel-->
    </section><!--/#main-slider-->
</body>
</html>
