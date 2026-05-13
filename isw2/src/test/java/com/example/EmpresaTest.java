package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmpresaTest {
    @Test
    void testGetCuil() {

    }

    @Test
    void testGetDireccion() {

    }

    @Test
    void testGetNombre() {

    }

    @Test
    void testSetCuil() {

    }

    @Test
    void testSetDireccion() {

    }

    @Test
    void testSetNombre() {
        Empresa emp = new Empresa("La Anonima", "Santa Fe 1234", "20-12345678-9");
        emp.setNombre("La Anonima");
        assertEquals("La Anonima", emp.getNombre());

    }

    @Test
    void testToString() {

    }
}
