package com.ismaelmaldonado.productos.service;

import java.util.List;
import com.ismaelmaldonado.productos.model.Producto;

/**
 * Interfaz de servicio para operaciones relacionadas con Productos.
 * 
 * Define los métodos principales que serán implementados para manejar la lógica
 * de negocio
 * relacionada con la entidad Producto en el sistema.
 */
public interface IProductoService {

    /**
     * Obtiene la lista completa de productos disponibles.
     * 
     * @return una lista de todos los productos.
     */
    public List<Producto> exponerListaProductos();

    /**
     * Obtiene un producto específico basado en su código.
     * 
     * @param codigoProducto el código identificador del producto deseado.
     * @return el Producto correspondiente al código proporcionado, o null si no se
     *         encuentra.
     */
    public Producto exponerProducto(int codigoProducto);

    /**
     * Actualiza el stock de un producto específico.
     * 
     * @param codigoProducto el código identificador del producto.
     * @param cantidad       la nueva cantidad de stock para el producto.
     */
    public void actualizarStock(int codigoProducto, int cantidad);

    /**
     * Obtiene el precio de un producto basado en su identificador.
     * 
     * @param id el identificador del producto.
     * @return el precio unitario del producto correspondiente al ID proporcionado.
     */
    public double obtenerPrecio(int id);
}
