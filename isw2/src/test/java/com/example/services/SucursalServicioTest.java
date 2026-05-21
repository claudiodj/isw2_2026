package com.example.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Sucursal;
import com.example.services.impl.SucursalServicioImpl;

public class SucursalServicioTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    private SucursalServicio servicio;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
        servicio = new SucursalServicioImpl();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void testCargarSucursal() {
        String input = "10\nSargento Cabral\n1250\nAZ963JK\n";
        provideInput(input);

        Sucursal sucursal = servicio.cargarSucursal();

        assertNotNull(sucursal);
        assertEquals(10, sucursal.getNumSuc());
        assertEquals("Sargento Cabral", sucursal.getCalle());
        assertEquals(1250, sucursal.getAltura());
        assertEquals("AZ963JK", sucursal.getCodPost());
    }

    @Test
    public void testMostrarSucursalEmpty() {
        List<Sucursal> list = new ArrayList<>();
        servicio.mostrarSucursal(list);
        assertTrue(testOut.toString().contains("No hay sucursales para mostrar."));
    }

    @Test
    public void testMostrarSucursalConDatos() {
        List<Sucursal> list = new ArrayList<>();
        list.add(new Sucursal(10, "Sargento Cabral", 1250, "AZ963JK"));
        servicio.mostrarSucursal(list);
        assertTrue(testOut.toString().contains("Sargento Cabral"));
    }
}
