package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    // Instanciamos un objeto de la clase con valores que nos pueden servir para el
    // test
    private Cliente cli = new Cliente("Juan", "Lizarraga", 35666777, "5491199667711");

    @Test
    void testGetAndSetApellido() {
        
        
        // Verificar que el get devuelva el valor correcto
        assertEquals("LIZARRAGA", cli.getApellido());

        // Datos para evaluar
        String ape = "fraga";

        // Verificar que el get devuelva el valor distinto
        assertNotEquals(ape, cli.getApellido());

        cli.setApellido(ape);

        // Verificar que el get devuelva el valor correcto
        assertEquals(ape.toUpperCase(), cli.getApellido());

    }

    @Test
    void testGetDni() {

    }

    @Test
    void testGetNombre() {
        // Datos para evaluar
        String nom = "Juan";

        // Verificar que el get devuelva el valor correcto
        assertEquals(nom, cli.getNombre());
    }

    @Tag("Prueba unitaria")
    @Test
    void testGetTelefono() {
    assertTimeout(Duration.ofSeconds(2), () -> {
        // código que debe completarse como máximo en 2 segundos
        String telCliente = cli.getTelefono();
        System.out.println(telCliente);
    });


    assertEquals("5491199667711", cli.getTelefono());

    cli.setTelefono("1144514170");

    assertEquals("1144514170", cli.getTelefono());

    }

    @Test
    void testSetApellido() {

    }

    @Test
    void testSetDni() {

    }

    @Test
    void testSetNombre() {

    }

    @Test
    void testSetTelefono() {

    }

    @Test
    void testToString() {

    }
}
