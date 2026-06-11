package com.example.demo_rest;

public class Solicitud {
    private String nombre;
    private int int1;
    private int int2;

    // Getters y Setters (necesarios para Spring)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getInt1() { return int1; }
    public void setInt1(int int1) { this.int1 = int1; }
    public int getInt2() { return int2; }
    public void setInt2(int int2) { this.int2 = int2; }
}
