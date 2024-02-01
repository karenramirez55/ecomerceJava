package com.example.demoJPA.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "clientes") //como buena practica seteamos el nombre para que sea en plural

public class Clientes {


@GeneratedValue(strategy = GenerationType.IDENTITY) //incrementador del ID
@Id
@Getter
@Setter
private  long id;


@OneToMany(mappedBy = "clientes")
private List<Productos> producto;

    @OneToMany(mappedBy = "clientes")
    private List<Ventas> Ventas;
    public List<Productos> getProducto() {
        return producto;
    }

    public void setProducto(List<Productos> producto) {
        this.producto = producto;
    }

    private String nombre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Getter
@Setter
@Column
private String apellido;

@Column
@Getter
@Setter
private String email;

@Column
@Getter
@Setter
private String telefono;

@Column
@Getter
@Setter
private String direccion;

@Column
@Getter
@Setter
private String ciudad;

@Column
@Getter
@Setter
private String pais;



}
