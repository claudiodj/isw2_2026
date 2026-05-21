package com.example.services.impl;

import java.util.List;
import java.util.Scanner;
import com.example.model.Empresa;
import com.example.services.EmpresaServicio;

public class EmpresaServicioImpl implements EmpresaServicio {

    @Override
    public Empresa cargarEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cargar Empresa ---");
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese CUIL: ");
        String cuil = scanner.nextLine();
        
        return new Empresa(nombre, direccion, cuil);
    }

    @Override
    public void mostrarEmpresa(List<Empresa> empresas) {
        if (empresas == null || empresas.isEmpty()) {
            System.out.println("No hay empresas para mostrar.");
        } else {
            System.out.println("\n--- Lista de Empresas ---");
            for (Empresa e : empresas) {
                System.out.println(e.toString());
            }
        }
    }
}
