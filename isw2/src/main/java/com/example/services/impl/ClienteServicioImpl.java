package com.example.services.impl;

import java.util.List;
import java.util.Scanner;
import com.example.model.Cliente;
import com.example.services.ClienteServicio;

public class ClienteServicioImpl implements ClienteServicio {

    @Override
    public Cliente cargarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cargar Cliente ---");
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // consumir salto de linea
        System.out.print("Ingrese telefono: ");
        String telefono = scanner.nextLine();
        
        return new Cliente(nombre, apellido, dni, telefono);
    }

    @Override
    public void mostrarCliente(List<Cliente> clientes) {
        if (clientes == null || clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar.");
        } else {
            System.out.println("\n--- Lista de Clientes ---");
            for (Cliente c : clientes) {
                System.out.println(c.toString());
            }
        }
    }
}
