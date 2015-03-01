class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/loginAdmin"(controller:"admin",action:"/login")
        "/"(view:"/index")
        "/success"(view:"/successCreate")
        "500"(view:'/error')
	}
}
