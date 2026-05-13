package com.example;

import java.util.Date;

public class Compra {

    Cliente clienteCompra; 
    Sucursal sucursalVenta;
    Date fechaCompra;
    float importeCompra;
    float importeDescuento;
    
    public Compra(Cliente clienteCompra, Sucursal sucursalVenta, Date fechaCompra, float importeCompra,
            float importeDescuento) {
        this.clienteCompra = clienteCompra;
        this.sucursalVenta = sucursalVenta;
        this.fechaCompra = fechaCompra;
        this.importeCompra = importeCompra;
        this.importeDescuento = importeDescuento;
    }

    public Cliente getClienteCompra() {
        return clienteCompra;
    }
    public void setClienteCompra(Cliente clienteCompra) {
        this.clienteCompra = clienteCompra;
    }
    public Sucursal getSucursalVenta() {
        return sucursalVenta;
    }
    public void setSucursalVenta(Sucursal sucursalVenta) {
        this.sucursalVenta = sucursalVenta;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public float getImporteCompra() {
        return importeCompra;
    }
    public void setImporteCompra(float importeCompra) {
        this.importeCompra = importeCompra;
    }
    public float getImporteDescuento() {
        return importeDescuento;
    }
    public void setImporteDescuento(float importeDescuento) {
        this.importeDescuento = importeDescuento;
    }

    @Override
    public String toString() {
        return "compra [clienteCompra=" + clienteCompra + ", sucursalVenta=" + sucursalVenta + ", fechaCompra="
                + fechaCompra + ", importeCompra=" + importeCompra + ", importeDescuento=" + importeDescuento + "]";
    }
    
    

}
