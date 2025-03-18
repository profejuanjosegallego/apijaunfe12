package com.example.apiREST.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String cedula;
    private String correo;
    private Integer salario;
    private Integer numeroVentas;
    private String telefono;
    private String ciudad;
    private Integer metaMensual;

    public Vendedor() {
    }

    public Vendedor(Integer id, String nombre, String cedula, String correo, Integer salario, Integer numeroVentas, String telefono, String ciudad, Integer metaMensual) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.salario = salario;
        this.numeroVentas = numeroVentas;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.metaMensual = metaMensual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(Integer numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getMetaMensual() {
        return metaMensual;
    }

    public void setMetaMensual(Integer metaMensual) {
        this.metaMensual = metaMensual;
    }
}
