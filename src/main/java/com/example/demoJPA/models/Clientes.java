package com.example.demoJPA.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "clientes") //como buena practica seteamos el nombre para que sea en plural
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //incrementador del ID
    @Column(name = "id_cliente")
    private  long idClientes; //esto indica que la PK id_cliente ahora sera guardada en idClientes

    @OneToMany(mappedBy = "idClientes")
    private List <Ventas> ventas;

    @Getter
    @Setter
    @Column
    private String nombre;

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

    @Column(name = "fecha_nacimiento")
    @Getter
    @Setter
    private String fechaNacimiento;

    public long getId() {
        return idClientes;
    }

    public void setId(long id) {
        this.idClientes = id;
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

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
