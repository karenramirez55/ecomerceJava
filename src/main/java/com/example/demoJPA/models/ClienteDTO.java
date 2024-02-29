package com.example.demoJPA.models;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
public class ClienteDTO {
    @Getter
    @Setter
    @Schema(description = "Nombre del Cliente",requiredMode = Schema.RequiredMode.REQUIRED, example = "Karen")
        private String nombre;

    @Schema(description = "Apellido del Cliente",requiredMode = Schema.RequiredMode.REQUIRED, example = "Ramirez")
    private String apellido;



    public ClienteDTO(){}
    public ClienteDTO(String nom, String apel){
            this.nombre = nom;
            this.apellido = apel;

        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
