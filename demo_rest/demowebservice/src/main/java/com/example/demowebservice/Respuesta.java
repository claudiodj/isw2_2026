package com.example.demowebservice;

public class Respuesta {
    private String mensaje;
    private String operacion;

    // Constructor
    public Respuesta(String mensaje, String operacion) {
        this.mensaje = mensaje;
        this.operacion = operacion;
    }

    // Getters (necesarios para la respuesta JSON)
    public String getMensaje() { return mensaje; }
    public String getOperacion() { return operacion; }
}
