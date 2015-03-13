    <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src="${resource(dir: 'images', file: 'logo.png')}" alt="logo" width="150" height="52"/></a>
                </div>

                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav"> 
                        <li>
                            <g:form controller="Customer" action="show">
                                <button type="submit" class="btn btn-primary btn-lg">Inicio</button>
                            </g:form>
                        </li> 
                        <li><g:form controller="Ticket" action="myTickets">
                            <button type="submit" class="btn btn-primary btn-lg">Mis Vuelos</button></g:form>
                        </li>
                        <li>
                             <g:form controller="Flight" action="mainSearch">
                                <button type="submit" class="btn btn-primary btn-lg">Buscar</button>
                            </g:form>
                        </li>  
                        <li>
                             <g:form controller="Airline" action="index">
                            <button type="submit" class="btn btn-primary btn-lg">Aerolineas</button>
                            </g:form>
                        </li>
                        <li>
                            <g:form controller="Person" action="logout">
                                <button type="submit" class="btn btn-primary btn-lg">Cerrar Sesión</button>
                            </g:form>
                        </li> 
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->