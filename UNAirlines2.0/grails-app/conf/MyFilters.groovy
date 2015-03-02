/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonatan
 */
class MyFilters {
    
    def filters = {
        
        loginCheck(controller:'person' , action:'*')
        {
            afterView = {
                if(!session.user && !actionName.equals('doLogin'))
                {
                    redirect(action:'doLogin')
                    return false
                }
            } 
        }
        loginAdmin(controller:'admin', action:'*'){
            afterView = {
                if (!session.isAdmin && actionName.equals('doLogin')) {
                    redirect(action:'doLogin')
                    return false
                }
            }
        }
        forbidden(controller:'admin' , action:'*')
        {
            before = {
                if(session.user && actionName.equals('index'))
                {
                    flash.message = "Usted tiene prohibida esta vista"
                    redirect(controller:'customer', action:'index')
                    return false
                }
            } 
        }
        
        /*forbiddenToAdmin(controller:'customer' , action:'*')
        {
            before = {
                if(session.isAdmin && actionName.equals('index'))
                {
                    flash.message = "Usted (Admin) tiene prohibida esta vista"
                    redirect(controller:'admin', action:'index')
                    return false
                }
            } 
        }*/
        
        
    }
	
}

