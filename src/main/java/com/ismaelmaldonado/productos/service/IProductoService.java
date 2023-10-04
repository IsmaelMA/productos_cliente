package com.ismaelmaldonado.productos.service;

import java.util.List;

import com.ismaelmaldonado.productos.model.Producto;

public interface IProductoService {

    public List<Producto> exponerListaProductos();

    public Producto exponerProducto(int codigoProducto);

    public void actualizarStock(int codigoProducto, int cantidad);

    public double obtenerPrecio(int id);
}
