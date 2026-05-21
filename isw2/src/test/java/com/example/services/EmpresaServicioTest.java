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

import com.example.model.Empresa;
import com.example.services.impl.EmpresaServicioImpl;

public class EmpresaServicioTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    private EmpresaServicio servicio;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
        servicio = new EmpresaServicioImpl();
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
    public void testCargarEmpresa() {
        String input = "La Anonima\nSanta Fe 1234\n20-12345678-9\n";
        provideInput(input);

        Empresa empresa = servicio.cargarEmpresa();

        assertNotNull(empresa);
        assertEquals("La Anonima", empresa.getNombre());
        assertEquals("Santa Fe 1234", empresa.getDireccion());
        assertEquals("20-12345678-9", empresa.getCuil());
    }

    @Test
    public void testMostrarEmpresaEmpty() {
        List<Empresa> list = new ArrayList<>();
        servicio.mostrarEmpresa(list);
        assertTrue(testOut.toString().contains("No hay empresas para mostrar."));
    }

    @Test
    public void testMostrarEmpresaConDatos() {
        List<Empresa> list = new ArrayList<>();
        list.add(new Empresa("La Anonima", "Santa Fe 1234", "20-12345678-9"));
        servicio.mostrarEmpresa(list);
        assertTrue(testOut.toString().contains("La Anonima"));
    }
}
