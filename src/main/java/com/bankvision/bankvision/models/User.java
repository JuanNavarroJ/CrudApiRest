package com.bankvision.bankvision.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class User {

    //Attributes
    @Id
    private int id;
    private String apellido;
    private int celular;
    private String nombre;

    //Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", celular='" + celular + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
