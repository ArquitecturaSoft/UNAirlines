package unairlines2

import org.grails.cxf.utils.EndpointType

class CrearUsuarioService {
    //static expose = EndpointType.JAX_WS
    static expose = ['cxf']
    static excludes = []
    
    String serviceMethod(String name, String surname, String email, String password, String phone, String address) 
    {
        Customer cliente = new Customer()
        cliente.name = name
        cliente.surname = surname
        cliente.email = email
        cliente.password = password
        cliente.phone = phone
        cliente.address = address
        cliente.save();
        return "Cliente creado exitosamente\n"+" "+ cliente.name+" "+ cliente.surname+" "+ cliente.email+" "+ cliente.password+" "+ cliente.phone+" "+ cliente.address 
    }
}