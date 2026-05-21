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

import com.example.model.Cliente;
import com.example.services.impl.ClienteServicioImpl;

public class ClienteServicioTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    private ClienteServicio servicio;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
        servicio = new ClienteServicioImpl();
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
    public void testCargarCliente() {
        String input = "Juan\nPerez\n12345678\n555-1234\n";
        provideInput(input);

        Cliente cliente = servicio.cargarCliente();

        assertNotNull(cliente);
        assertEquals("Juan", cliente.getNombre());
        assertEquals("PEREZ", cliente.getApellido());
        assertEquals(12345678, cliente.getDni());
        assertEquals("555-1234", cliente.getTelefono());
    }

    @Test
    public void testMostrarClienteEmpty() {
        List<Cliente> list = new ArrayList<>();
        servicio.mostrarCliente(list);
        assertTrue(testOut.toString().contains("No hay clientes para mostrar."));
    }

    @Test
    public void testMostrarClienteConDatos() {
        List<Cliente> list = new ArrayList<>();
        list.add(new Cliente("Juan", "Perez", 12345678, "555-1234"));
        servicio.mostrarCliente(list);
        assertTrue(testOut.toString().contains("Juan"));
    }
}
