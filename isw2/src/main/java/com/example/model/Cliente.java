package com.example.model;

public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;
    private String telefono;

    
    public Cliente(){};
    
    public Cliente(String nombre, String apellido, int dni, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido.toUpperCase();
        this.dni = dni;
        this.telefono = telefono;
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
        this.apellido = apellido.toUpperCase();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        try {
            int demora = 1500; // en milisegundos
            System.out.println("Inicio demora de " + demora/1000 + " segundos...");
            Thread.sleep(demora);
            System.out.println("... fin demora de " + demora/1000 + " segundos");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + "]";
    }

    
    
}
