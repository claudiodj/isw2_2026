package com.example;

import com.example.model.Cliente;
import com.example.model.Compra;
import com.example.model.Sucursal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class CompraTest {

    // Instanciamos un objeto clase cliente con valores que nos pueden servir para el test
    private Cliente cli = new Cliente("Juan", "Lizarraga", 35666777, "5491199667711");
    
    // Instanciamos un objeto clase sucursal con valores que nos pueden servir para el test
    private Sucursal suc = new Sucursal(10, "Sargento Cabral", 1250, "AZ963JK");

    // Instanciamos un objeto clase compra con valores que nos pueden servir para el test
    private Compra com = new Compra(cli, suc, new Date(), 20000, 1000);
    private Compra com2 = new Compra(cli, suc, new Date(), 20000, 2001);
    private Compra com3 = new Compra();

    @Test
    void testGetClienteCompra() {
        assertNotNull(cli);
        assertEquals(cli.getNombre(), "Juan");
    }

    @Test
    void testGetFechaCompra() {

    }

    @Test
    void testGetImporteCompra() {
        assertNotNull(com3);
    }

    @Test
    void testGetImporteDescuento() {
        assertTrue(com.getImporteDescuento() <= com.getImporteCompra());
        assertTrue(com2.getImporteDescuento() <= com2.getImporteCompra());
    }

    @Test
    void testGetSucursalVenta() {

    }

    @Test
    void testSetClienteCompra() {
        Cliente cliTest = new Cliente();
        assertNotNull(cliTest);
        cliTest.setNombre("Homero");
        assertEquals(cliTest.getNombre(), "Homero");


    }

    @Test
    void testSetFechaCompra() {

    }

    @Test
    void testSetImporteCompra() {

    }

    @Test
    void testSetImporteDescuento() {

    }

    @Test
    void testSetSucursalVenta() {

    }
}
