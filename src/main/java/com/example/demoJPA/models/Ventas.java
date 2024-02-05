package com.example.demoJPA.models;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.Getter;
import lombok.Setter;
import static jakarta.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "Ventas")


public class Ventas {

    //Le decimos que va a tener un id único PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;


    //Hacemos el muchos a uno, con los id de la clase Clientes

    @ManyToOne
    private Clientes idClientes;
    @JoinColumn(name = "idClientes")


    //Hacemos el muchos a uno, con los id de la clase productos

    @ManyToOne
    private Productos idProductos;
    @JoinColumn(name = "idProductos")


    public Clientes getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(Clientes idClientes) {
        this.idClientes = idClientes;
    }

    public Productos getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Productos idProductos) {
        this.idProductos = idProductos;
    }
}
