package com.example.demoJPA.Services;
import com.example.demoJPA.models.Clientes;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicesImplementation implements ClienteServices {
    @Override
    public String grabar(Clientes clientes){
         String respuesta ="";
         if (clientes.getNombre()==null || clientes.getApellido()==null){
             respuesta= "409 la operación no se pudo realizar, verificar";
         }
         return respuesta;
    }

}
//PARA CHEQUEAR SI LA LÓGICA QUE TENEMOS EN CONTROLLERS, SE PUEDE APLICAR ACA