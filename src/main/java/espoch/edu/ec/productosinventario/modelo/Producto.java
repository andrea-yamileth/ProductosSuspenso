/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.productosinventario.modelo;

/**
 *
 * @author LAPTOP DELL
 */
public class Producto {
    
    private String Nombre;
    private double Precio; 
    private boolean Perecedero;

    public Producto(String Nombre, double Precio, boolean Perecedero) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Perecedero = Perecedero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isPerecedero() {
        return Perecedero;
    }

    public void setPerecedero(boolean Perecedero) {
        this.Perecedero = Perecedero;
    }

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
