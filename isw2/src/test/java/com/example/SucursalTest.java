package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SucursalTest {
    @Test
    void testGetAltura() {

    }

    @Test
    void testGetCalle() {
        Sucursal suc = new Sucursal(10, "Sargento Cabral", 1250, "AZ963JK");
        
        assertEquals(suc.getCalle(), "Sargento Cabral");
        suc.setCalle("Avellaneda");
        Sucursal suc1 = new Sucursal();
        suc1.setCalle("Avellaneda");
        assertEquals(suc.getCalle(), "Avellaneda");
        assertTrue(suc.getCalle().equals(suc1.getCalle()));
    }

    @Test
    void testGetCodPost() {

    }

    @Test
    void testGetNumSuc() {

    }

    @Test
    void testSetAltura() {

    }

    @Test
    void testSetCalle() {

    }

    @Test
    void testSetCodPost() {

    }

    @Test
    void testSetNumSuc() {

    }

    @Test
    void testToString() {

    }
}
