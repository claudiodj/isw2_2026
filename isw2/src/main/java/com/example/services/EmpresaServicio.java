package com.example.services;

import java.util.List;
import com.example.model.Empresa;

public interface EmpresaServicio {
    Empresa cargarEmpresa();
    void mostrarEmpresa(List<Empresa> empresas);
}
