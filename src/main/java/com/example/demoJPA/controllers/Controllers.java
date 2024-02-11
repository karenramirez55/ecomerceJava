package com.example.demoJPA.controllers;

import com.example.demoJPA.models.Clientes;
import com.example.demoJPA.repository.Repository;
import jakarta.persistence.Id;
import jakarta.persistence.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Period;

@RestController
public class Controllers {

    @Autowired
    private Repository repo; //inicia nuestro controlador

    @GetMapping //mapea con la web y postman URL con el GET
    public String index(){
        return "Conectado a postman y al local host de la web...";
    }

    @GetMapping("clientes") //CREA UN ARRAY CON LA CLASE CLIENTES
    public List <Clientes> getClientes(){
        return repo.findAll();
    }

    @PostMapping("alta") //METODO POST MODIFICA UN CLIENTE
    public String post(@RequestBody Clientes cliente){
        repo.save(cliente);
            return "Guardado correctamente";
    }

    @PutMapping("modificar/{id}") //UPDATEA MODIFICA ALGUN DATO POR EL MOMENTO DESDE POSTMAN
    public String update(@PathVariable Long id,@RequestBody Clientes cliente){
        Clientes updateCliente=repo.findById(id).get();
        updateCliente.setNombre(cliente.getNombre());
        updateCliente.setEmail(cliente.getEmail());
        repo.save(updateCliente);
        return "Se modifico correctamente";

    }
    @DeleteMapping("modificar/{id}") // elimina un dato
    public String delete(@PathVariable Long id){
        Clientes deleteCliente= repo.findById(id).get();
        repo.delete(deleteCliente);
        return "Cliente eliminado";
    }

    @GetMapping("edad")
    public String edad(@RequestParam("fechaDeNacimiento") LocalDate fechaDeNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        int edad = periodo.getYears();
        return "La edad es: " + edad + " años";
    }




}
