class MyFilters {
    
    def filters = {
        accessFilterCustomer(controller:'customer', action:'*'){
            before = {
                if ( !actionName.equals('doLogin') && !actionName.equals('create') && (session.logged == null || session.isAdmin == true) ) {
                    redirect(uri:'/')
                    return false
                }
            }
        }
        
        accessFilterAdmin(controller:'admin', action:'*'){
            before = {
                if ( !actionName.equals('doLogin') && (session.logged == null || session.isAdmin == false)) {
                    redirect(uri:'/')
                    return false
                }
            }
        }
    }
	
}

