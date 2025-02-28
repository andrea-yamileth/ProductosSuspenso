/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.productosinventario.modelo;

/**
 *
 * @author LAPTOP DELL
 */
public class GestionProducto {
    int tamaVect = 5;
    Producto[] productos = new Producto[tamaVect];
    int cont = 0;

    public String agregarProductos(Producto producto) {
        String msg = "Guardado exitosamente";
        if (cont < productos.length) {
            productos[cont] = producto;
            cont++;
        } else {
            msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Producto[] listarProductosRegistrados() {
        Producto[] auxProducto = new Producto[cont];
        System.arraycopy(productos, 0, auxProducto, 0, cont);
        return auxProducto;
    }
    
}
