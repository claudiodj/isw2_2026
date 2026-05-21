package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.model.Cliente;
import com.example.model.Compra;
import com.example.model.Empresa;
import com.example.model.Sucursal;

import com.example.services.ClienteServicio;
import com.example.services.impl.ClienteServicioImpl;
import com.example.services.EmpresaServicio;
import com.example.services.impl.EmpresaServicioImpl;
import com.example.services.SucursalServicio;
import com.example.services.impl.SucursalServicioImpl;
import com.example.services.CompraServicio;
import com.example.services.impl.CompraServicioImpl;

public class Main {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();
        List<Empresa> listaEmpresas = new ArrayList<>();
        List<Compra> listaCompras = new ArrayList<>();
        List<Sucursal> listaSucursales = new ArrayList<>();

        ClienteServicio clienteServicio = new ClienteServicioImpl();
        EmpresaServicio empresaServicio = new EmpresaServicioImpl();
        SucursalServicio sucursalServicio = new SucursalServicioImpl();
        CompraServicio compraServicio = new CompraServicioImpl();

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Cargar Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Cargar Empresa");
            System.out.println("4. Mostrar Empresas");
            System.out.println("5. Cargar Sucursal");
            System.out.println("6. Mostrar Sucursales");
            System.out.println("7. Cargar Compra");
            System.out.println("8. Mostrar Compras");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    listaClientes.add(clienteServicio.cargarCliente());
                    break;
                case 2:
                    clienteServicio.mostrarCliente(listaClientes);
                    break;
                case 3:
                    listaEmpresas.add(empresaServicio.cargarEmpresa());
                    break;
                case 4:
                    empresaServicio.mostrarEmpresa(listaEmpresas);
                    break;
                case 5:
                    listaSucursales.add(sucursalServicio.cargarSucursal());
                    break;
                case 6:
                    sucursalServicio.mostrarSucursal(listaSucursales);
                    break;
                case 7:
                    listaCompras.add(compraServicio.cargarCompra());
                    break;
                case 8:
                    compraServicio.mostrarCompra(listaCompras);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor intente nuevamente.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}