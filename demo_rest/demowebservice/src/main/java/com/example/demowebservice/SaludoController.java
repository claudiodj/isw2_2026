package com.example.demowebservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @PostMapping("/saludar-y-sumar")
    public Respuesta saludarYSumar(@RequestBody Solicitud solicitud) {
        String mensaje = "¡Hola " + solicitud.getNombre() + "!";
        mensaje = mensaje + " vamos a sumar " + solicitud.getInt1() + " con " + solicitud.getInt2();
        int suma = solicitud.getInt1() + solicitud.getInt2();
        return new Respuesta(mensaje, "La suma es: " + suma);
    }

    @PostMapping("/saludar-y-restar")
    public Respuesta saludarYRestar(@RequestBody Solicitud solicitud) {
        String mensaje = "¡Hola " + solicitud.getNombre() + "!";
        int resta = solicitud.getInt1() - solicitud.getInt2();
        return new Respuesta(mensaje, "La resta es: " + resta);
    }
}