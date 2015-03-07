import unairlines2.Admin
import unairlines2.Customer
import unFlight.*
import unairlines2.Flight

/**
 *
 * @author Jhonatan
 */
class FinalFilters {
    
    def filters = {
        
        /**
         * Filtro para todas las vistas del administrador,
         * si es usuario administrador, no puede ver index
         * y create. Si es usuario cliente o usuario invitado
         * tiene prohibido todo
        */
        forbiddenAdmin(controller:'admin', action:'*')
        {
            before = {
                
                if(session.user && session.isAdmin && actionName.equals('index'))
                {
                    flash.message = "Usted no puede listar administradores"
                    redirect(controller:'admin', action:'show' , id: session.user.id)
                    return false
                }
                
                if(session.user && session.isAdmin && actionName.equals('create'))
                {
                    flash.message = "Usted no puede crear con una sesión iniciada"
                    redirect(controller:'admin', action:'show' , id: session.user.id)
                    return false
                }
                
                if(session.user && session.isAdmin && actionName.equals('login'))
                {
                    flash.message = "Usted no puede volver a iniciar sesion"
                    redirect(controller:'admin', action:'show' , id: session.user.id)
                    return false
                }
                
                if(session.user && !session.isAdmin)
                {
                    flash.message = "Usted no puede acceder a administradores"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }
                
                if(!session.user && !(actionName.equals('login') || actionName.equals('doLogin')))
                {
                    flash.message = "Usted no puede acceder"
                    redirect(url:"/")
                    return false
                }
            } 
        }
        /**
         * Filtro para todas las vistas del customer,
         * si es usuario customer, no puede ver index
         * y create. Si es usuario administrador tiene
         * prohibido todo. Si es invitado puede ver create
        */
        forbiddenCustomer(controller:'customer', action:'*')
        {
            before = {
                
                if(session.user && actionName.equals('index'))
                {
                    flash.message = "No puede listar usuarios"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }
                
                if(session.user && actionName.equals('create'))
                {
                    flash.message = "No puede crear con una sesión iniciada"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }
                
                if(session.user && session.isAdmin)
                {
                    flash.message = "Usted no puede acceder a usuarios"
                    redirect(controller:'admin', action:'show' , id: session.user.id)
                    return false
                }
                
                //condicional que valida la vista "registrarse" del usuario invitado
                if(!session.user && !(actionName.equals('create') || actionName.equals('save')))
                {
                    flash.message = "No puede acceder si no está registrado"
                    redirect(url:"/")
                    return false
                } 
            } 
        }
        /**
         * Filtro para todas las vistas de person,
         * si es usuario registrado, no puede acceder
         * a nada, si es invitado, puede accerder al login
        */
        forbiddenPerson(controller:'person', action:'*')
        {
            before = {
                //condicional que valida la vista "login" del usuario invitado
                if(!session.user && !(actionName.equals('login') || actionName.equals('doLogin')))
                {
                    flash.message = "No puede acceder"
                    redirect(url:"/")
                    return false
                }
                if(session.user && !session.isAdmin && !(actionName.equals('logout')))
                {
                    flash.message = "No puede acceder"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }
                if(session.user && session.isAdmin)
                {
                    flash.message = "No puede acceder"
                    redirect(controller:'admin', action:'show' , id: session.user.id)
                    return false
                }
            }
        }
        /**
         * Filtro para todas las vistas de la aerolinea,
         * si es usuario customer solo puede ver el index,
         * si es usuario invitado no puede ver nada. El 
         * administrador tiene todos los permisos
        */
        forbiddenAirline(controller:'airline', action:'*')
        {
            before = {
                //verificar que el administrador si pueda entrar
                if(session.user && !session.isAdmin && actionName.equals('create'))
                {
                    flash.message = "Usted solo puede ver la lista de aerolineas"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                } 
                
                if(session.user && !session.isAdmin && actionName.equals('edit'))
                {
                    flash.message = "Usted solo puede ver la lista de aerolineas"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }    
                
                if(session.user && !session.isAdmin && actionName.equals('show'))
                {
                    flash.message = "Usted solo puede ver la lista de aerolineas"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }    
                
                if(!session.user)
                {
                    flash.message = "No puede acceder si no está registrado"
                    redirect(url:"/")
                    return false
                } 
            }    
        }
        /**
         * Filtro para todas las vistas de los vuelos
         * si es cliente, accede a listSearch, mainSearch y doSearch
         * si es invitado, no tiene acceso
         * administrador tiene acceso total
        */
        forbiddenFlight(controller:'flight', action:'*')
        {
            before = {
                //verificar que el administrador si tenga acceso en el crud
                if(session.user && !session.isAdmin && !(actionName.equals('mainSearch') || actionName.equals('listSearch') || actionName.equals('doSearch') || actionName.equals('showFlight')))
                {
                    flash.message = "Usted tiene prohibida esta vista"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                }
        
                if(!session.user)
                {
                    flash.message = "No puede acceder si no es cliente registrado"
                    redirect(url:"/")
                    return false
                }  
            }    
        }
        /**
         * Filtro para todas las vistas categoria
         * si es cliente, no tiene acceso
         * si es invitado, no tiene acceso
         * administrador tiene acceso total
        */
        forbiddenFlightClass(controller:'flightClass', action:'*')
        {
            before = {
                //verificar que el administrador si tenga acceso
                if(session.user && !session.isAdmin)
                {
                    flash.message = "No puede acceder si no es administrador"
                    redirect(controller:'customer', action:'show' , id: session.user.id)
                    return false
                } 
                if(!session.user)
                {
                    flash.message = "No puede acceder si no es administrador"
                    redirect(url:"/")
                    return false
                } 
            }    
        }
        /**
         * De momento nadie tiene acceso a las vistas
         * del dominio ticket, si requieren acceso, por
         * favor COMENTAR el filtro
        */
        forbiddenTicket(controller:'ticket', action:'*')
        {
            before = {
                if(!session.user)
                {
                    flash.message = "Nadie tiene acceso, de momento"
                    redirect(url:"/")
                    return false
                }
                
                if(session.user && !session.isAdmin)
                {
                    flash.message = "Nadie tiene acceso, de momento"
                    redirect(url:"/")
                    return false
                }
                
                if(session.user && session.isAdmin)
                {
                    flash.message = "Nadie tiene acceso, de momento"
                    redirect(url:"/")
                    return false
                }

            } 
        }
    }
}

