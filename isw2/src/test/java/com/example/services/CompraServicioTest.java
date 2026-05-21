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
import java.util.Date;
import java.util.List;

import com.example.model.Compra;
import com.example.services.impl.CompraServicioImpl;

public class CompraServicioTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    private CompraServicio servicio;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
        servicio = new CompraServicioImpl();
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
    public void testCargarCompra() {
        String input = "20000\n1000\n";
        provideInput(input);

        Compra compra = servicio.cargarCompra();

        assertNotNull(compra);
        assertEquals(20000.0f, compra.getImporteCompra());
        assertEquals(1000.0f, compra.getImporteDescuento());
        assertNotNull(compra.getFechaCompra());
    }

    @Test
    public void testMostrarCompraEmpty() {
        List<Compra> list = new ArrayList<>();
        servicio.mostrarCompra(list);
        assertTrue(testOut.toString().contains("No hay compras para mostrar."));
    }

    @Test
    public void testMostrarCompraConDatos() {
        List<Compra> list = new ArrayList<>();
        list.add(new Compra(null, null, new Date(), 20000, 1000));
        servicio.mostrarCompra(list);
        assertTrue(testOut.toString().contains("20000"));
    }
}
