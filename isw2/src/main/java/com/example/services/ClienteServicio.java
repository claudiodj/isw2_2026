package com.example.services;

import java.util.List;
import com.example.model.Cliente;

public interface ClienteServicio {
    Cliente cargarCliente();
    void mostrarCliente(List<Cliente> clientes);
}
