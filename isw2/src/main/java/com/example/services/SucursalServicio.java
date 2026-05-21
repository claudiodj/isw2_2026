package com.example.services;

import java.util.List;
import com.example.model.Sucursal;

public interface SucursalServicio {
    Sucursal cargarSucursal();
    void mostrarSucursal(List<Sucursal> sucursales);
}
