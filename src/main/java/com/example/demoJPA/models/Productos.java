package com.example.demoJPA.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private  long id;

    @Column
    @Getter
    @Setter


    private String producto;

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @ManyToOne
    private Clientes clientes;


    public String getProducto() {
        return producto;
    }

    public void setProducto1(String producto1) {
        this.producto = producto;
    }





}
