package com.example.demoJPA.models;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.Getter;
import lombok.Setter;
import static jakarta.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "Ventas")


public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private String venta;

    private  long id; //le decimos que va a tener un ID único PK
    @Getter
    @Setter
    @Column
    private String idClientes;

    @Getter
    @Setter
    @Column
    private String idProductos;

    @ManyToOne
    private Clientes clientes;  //guarda un objeto de tipo CLIENTES
    @JoinColumn(name = "idClientes")

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public String getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(String idClientes) {
        this.idClientes = idClientes;
    }

    public String getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
