package com.ismaelmaldonado.productos.model;

/**
 * Representa una entidad Producto en el sistema.
 * 
 * Esta clase es una representación del modelo Producto tanto en el cliente como
 * en el servidor dentro del mismo ecosistema de proyectos.
 */
public class Producto {

    /** Identificador único para un producto. */
    private int codigoProducto;

    /** Nombre o descripción del producto. */
    private String producto;

    /** Precio unitario del producto. */
    private double precioUnitario;

    /** Stock disponible del producto. */
    private int stock;

    /**
     * Constructor sin argumentos.
     */
    public Producto() {
    }

    /**
     * Constructor con argumentos para inicializar todas las propiedades de un
     * producto.
     * 
     * @param codigoProducto el identificador del producto.
     * @param producto       el nombre o descripción del producto.
     * @param precioUnitario el precio unitario del producto.
     * @param stock          el stock disponible del producto.
     */
    public Producto(int codigoProducto, String producto, double precioUnitario, int stock) {
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Devuelve una representación en cadena del objeto Producto.
     *
     * @return una representación en cadena de este Producto.
     */
    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", producto=" + producto + ", precioUnitario="
                + precioUnitario + ", stock=" + stock + "]";
    }

    /**
     * Genera un hash basado en el código del producto.
     *
     * @return el valor hash del objeto.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProducto;
        return result;
    }

    /**
     * Compara este Producto con otro objeto para determinar si son iguales.
     *
     * @param obj el objeto a comparar con.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (codigoProducto != other.codigoProducto)
            return false;
        return true;
    }

}
