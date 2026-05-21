package com.example.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.example.model.Compra;
import com.example.services.CompraServicio;

public class CompraServicioImpl implements CompraServicio {

    @Override
    public Compra cargarCompra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cargar Compra ---");
        System.out.print("Ingrese importe de la compra: ");
        float importeCompra = scanner.nextFloat();
        System.out.print("Ingrese importe de descuento: ");
        float importeDescuento = scanner.nextFloat();
        scanner.nextLine(); // consumir enter
        
        // Asignamos cliente nulo, sucursal nula y fecha actual por defecto para la carga básica
        return new Compra(null, null, new Date(), importeCompra, importeDescuento);
    }

    @Override
    public void mostrarCompra(List<Compra> compras) {
        if (compras == null || compras.isEmpty()) {
            System.out.println("No hay compras para mostrar.");
        } else {
            System.out.println("\n--- Lista de Compras ---");
            for (Compra c : compras) {
                System.out.println(c.toString());
            }
        }
    }
}
