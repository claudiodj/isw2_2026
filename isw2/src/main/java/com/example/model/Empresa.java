package com.example.model;

public class Empresa {

    private String nombre;
    private String direccion;
    private String cuil;

    private Empresa(){};

    public Empresa(String nombre, String direccion, String cuil) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", direccion=" + direccion + ", cuil=" + cuil + "]";
    }

    
}
