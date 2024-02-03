package com.example.demoJPA.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Entity
@Table(name = "productos") //renombramos la tabla productos


public class Productos { //creamos clase producto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //le decimos que va a tener un ID
    @Column
    @Getter
    @Setter

    @OneToMany
    private Clientes clientes;


    private  long id; //le decimos que va a tener un ID único PK
    private String producto;


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
