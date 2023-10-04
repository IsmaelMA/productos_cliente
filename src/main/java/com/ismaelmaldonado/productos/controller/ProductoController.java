package com.ismaelmaldonado.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ismaelmaldonado.productos.model.Producto;
import com.ismaelmaldonado.productos.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping(value = "/producto")
    public List<Producto> listarProductos() {
        return productoService.exponerListaProductos();
    }

    @GetMapping(value = "/producto/{id}")
    public double getPrecio(@PathVariable("id") int id) {
        return productoService.obtenerPrecio(id);
    }

    @PutMapping(value = "/producto/{id}/{cantidad}")
    public void actualizarStock(@PathVariable("id") int id, @PathVariable("cantidad") int cantidad) {
        productoService.actualizarStock(id, cantidad);
    }

}
