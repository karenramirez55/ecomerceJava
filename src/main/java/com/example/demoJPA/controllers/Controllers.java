package com.example.demoJPA.controllers;

import com.example.demoJPA.Services.ClienteServices;
import com.example.demoJPA.models.ClienteDTO;
import com.example.demoJPA.models.Clientes;
import com.example.demoJPA.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;


@RestController


public class Controllers {


    @Autowired
    private Repository repo; //inicia nuestro controlador

    @Autowired
    private ClienteServices clienteServices;

    @GetMapping //mapea con la web y postman URL con el GET
    public String index(){
        return "Conectado a postman y al local host de la web...";
    }

    @Operation(summary = "Listado de todos los clientes",description = "Permite ver la lista de clientes")
    @GetMapping("clientes") //CREA UN ARRAY CON LA CLASE CLIENTES
    public List <Clientes> getClientes(){
        return repo.findAll();
    }

    @Operation(summary = "Crear nuevo usuario", description = "Permite dar de alta un cliente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "400", description = "Parámetros incorrectos",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClienteDTO.class)))
    })
    @PostMapping("alta") //METODO POST DA DE ALTA  UN CLIENTE
    public String post(@RequestBody Clientes cliente){

        String respuesta= clienteServices.grabar(cliente);
        if (respuesta.equals("")){
            repo.save(cliente);
            respuesta= "Guardado correctamente";
        }
        return respuesta;
    }

    @Operation(summary = "Modificar cliente",description = "Permite modificar datos del Cliente por ID")
    @PutMapping("modificar/{id}") //UPDATEA MODIFICA ALGUN DATO POR EL MOMENTO DESDE POSTMAN
    public String update(@PathVariable Long id,@RequestBody Clientes cliente){
        Clientes updateCliente=repo.findById(id).get();
        updateCliente.setNombre(cliente.getNombre());
        updateCliente.setEmail(cliente.getEmail());
        repo.save(updateCliente);
        return "Se modifico correctamente";

    }
    @Operation(summary = "Eliminar cliente", description = "Permite eliminar un cliente por ID")
    @DeleteMapping("delete/{id}") // elimina un cliente
    public String delete(@PathVariable Long id){
        Clientes deleteCliente= repo.findById(id).get();
        repo.delete(deleteCliente);
        return "Cliente eliminado";
    }

    



}
