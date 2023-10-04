package com.ismaelmaldonado.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ismaelmaldonado.productos.model.Producto;
import com.ismaelmaldonado.productos.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * Controlador para gestionar las operaciones relacionadas con Productos.
 * 
 * Esta clase controla las operaciones CRUD y otras operaciones relacionadas
 * con los productos, proporcionando endpoints para listar productos,
 * obtener el precio de un producto y actualizar el stock de un producto.
 */
@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    /**
     * Endpoint para obtener la lista completa de productos.
     * 
     * @return una lista de todos los productos.
     */
    @GetMapping(value = "/producto")
    public List<Producto> listarProductos() {
        return productoService.exponerListaProductos();
    }

    /**
     * Endpoint para obtener el precio de un producto basado en su identificador.
     * 
     * @param id el identificador del producto.
     * @return el precio unitario del producto correspondiente al ID proporcionado.
     */
    @GetMapping(value = "/producto/{id}")
    public double getPrecio(@PathVariable("id") int id) {
        return productoService.obtenerPrecio(id);
    }

    /**
     * Endpoint para actualizar el stock de un producto específico.
     * 
     * @param id       el identificador del producto.
     * @param cantidad la nueva cantidad de stock para el producto.
     */
    @PutMapping(value = "/producto/{id}/{cantidad}")
    public void actualizarStock(@PathVariable("id") int id, @PathVariable("cantidad") int cantidad) {
        productoService.actualizarStock(id, cantidad);
    }

}
