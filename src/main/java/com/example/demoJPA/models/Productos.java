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
    @Column(name = "id_productos")
    private  long idProductos; //le decimos que va a tener un ID único PK

    @Column
    @Getter
    @Setter
    private String producto;

    @Column
    @Getter
    @Setter
    private String categoria;

    @Column
    @Getter
    @Setter
    private double precio;

    @OneToMany(mappedBy = "idProductos")
    private List<Ventas> ventas;


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
