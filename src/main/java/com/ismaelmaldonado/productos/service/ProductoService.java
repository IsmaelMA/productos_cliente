package com.ismaelmaldonado.productos.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ismaelmaldonado.productos.model.Producto;

/**
 * Implementación del servicio para operaciones relacionadas con Productos.
 * 
 * Esta clase provee la implementación concreta de los métodos definidos
 * en la interfaz IProductoService. Internamente utiliza un cliente REST
 * para comunicarse con un servicio remoto.
 */
@Service
public class ProductoService implements IProductoService {

    @Autowired
    RestTemplate template;

    /** La URL base del servicio remoto de productos */
    private static final String url = "http://localhost:8080/producto";

    /**
     * Obtiene la lista completa de productos disponibles desde el servicio remoto.
     * 
     * @return una lista de todos los productos.
     */
    @Override
    public List<Producto> exponerListaProductos() {
        return Arrays.asList(template.getForObject(url, Producto[].class));
    }

    /**
     * Obtiene un producto específico basado en su código desde el servicio remoto.
     * 
     * @param codigoProducto el código identificador del producto deseado.
     * @return el Producto correspondiente al código proporcionado, o null si no se
     *         encuentra.
     */
    @Override
    public Producto exponerProducto(int codigoProducto) {
        return null; // Aún no implementado
    }

    /**
     * Actualiza el stock de un producto específico en el servicio remoto.
     * 
     * @param codigoProducto el código identificador del producto.
     * @param cantidad       la nueva cantidad de stock para el producto.
     */
    @Override
    public void actualizarStock(int codigoProducto, int cantidad) {
        template.put(url + "/" + codigoProducto + "/" + cantidad, null);
    }

    /**
     * Obtiene el precio de un producto basado en su identificador desde el servicio
     * remoto.
     * 
     * @param id el identificador del producto.
     * @return el precio unitario del producto correspondiente al ID proporcionado.
     */
    @Override
    public double obtenerPrecio(int id) {
        return template.getForObject(url + "/" + id, Double.class);
    }
}
