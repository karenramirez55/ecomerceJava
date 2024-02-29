package Services;

import com.example.demoJPA.models.Clientes;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//ESTO ES LO QUE NO SE FUNCIONA LA LÓGICA

@Service
public class ClienteService {
    public String grabar(@NotNull Clientes clientes) {
        if (clientes.getNombre() == null || clientes.getApellido() == null) {
            return "409 La operacion no se pudo realizar, verificar!";
        } else {
            return "200 -> verificado!";
        }
    }
}