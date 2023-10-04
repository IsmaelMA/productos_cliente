package com.ismaelmaldonado.productos.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.ismaelmaldonado.productos.model.Producto;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    RestTemplate template;

    private static final String url = "http://localhost:8080/producto";

    @Override
    public List<Producto> exponerListaProductos() {
        return Arrays.asList(template.getForObject(url, Producto[].class));
    }

    @Override
    public Producto exponerProducto(int codigoProducto) {
        return null;
    }

    @Override
    public void actualizarStock(int codigoProducto, int cantidad) {
        template.put(url + "/" + codigoProducto + "/" + cantidad, null);

    }

    @Override
    public double obtenerPrecio(int id) {
        return template.getForObject(url + "/" + id, Double.class);

    }

}
