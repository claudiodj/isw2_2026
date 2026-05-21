package com.example.services;

import java.util.List;
import com.example.model.Compra;

public interface CompraServicio {
    Compra cargarCompra();
    void mostrarCompra(List<Compra> compras);
}
