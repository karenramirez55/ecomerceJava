package Services;

import com.example.demoJPA.models.Clientes;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public abstract class ClienteService {
    @Autowired
    public ResponseEntity<String> grabar(@NotNull Clientes clientes) {
        if (clientes.getNombre() == null || clientes.getApellido() == null) {
            return ResponseEntity.status(500).body("409 La operacion no se pudo realizar, verificar!");
        } else {
            // Agrega una instrucción de retorno aquí (por ejemplo, 200 o 204)
            return ResponseEntity.status(200).body("verificado!");
        }
    }
}