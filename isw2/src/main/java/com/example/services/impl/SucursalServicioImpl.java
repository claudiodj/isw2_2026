package com.example.services.impl;

import java.util.List;
import java.util.Scanner;
import com.example.model.Sucursal;
import com.example.services.SucursalServicio;

public class SucursalServicioImpl implements SucursalServicio {

    @Override
    public Sucursal cargarSucursal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cargar Sucursal ---");
        System.out.print("Ingrese numero de sucursal: ");
        int numSuc = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ingrese altura: ");
        int altura = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese codigo postal: ");
        String codPost = scanner.nextLine();
        
        return new Sucursal(numSuc, calle, altura, codPost);
    }

    @Override
    public void mostrarSucursal(List<Sucursal> sucursales) {
        if (sucursales == null || sucursales.isEmpty()) {
            System.out.println("No hay sucursales para mostrar.");
        } else {
            System.out.println("\n--- Lista de Sucursales ---");
            for (Sucursal s : sucursales) {
                System.out.println(s.toString());
            }
        }
    }
}
