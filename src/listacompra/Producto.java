/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra;

/**
 *
 * @author luis
 */
public class Producto {
    private String marca, nombre_producto;
    private int cantidad;

    public Producto(String marca, String nombre_producto, int cantidad) {
        this.marca = marca;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        String aux="El producto se llama "+nombre_producto+" es de la marca "+marca+
                " y quieres "+cantidad+" unidades";
        return aux; //To change body of generated methods, choose Tools | Templates.
    }
    
}
