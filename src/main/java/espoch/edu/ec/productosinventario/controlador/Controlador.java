/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.productosinventario.controlador;

import espoch.edu.ec.productosinventario.modelo.GestionProducto;
import espoch.edu.ec.productosinventario.modelo.Producto;
import espoch.edu.ec.productosinventario.vista.ListarIU;
import espoch.edu.ec.productosinventario.vista.Principal;

/**
 *
 * @author LAPTOP DELL
 */
public class Controlador {
    private Principal principal;
    private GestionProducto gestionProductosGracia;
    private ListarIU listarIU;

    public Controlador(Principal principal, ListarIU listarIU) {
        this.principal = principal;
        this.listarIU = listarIU;
        this.gestionProductosGracia = new GestionProducto();
    }

    public void agregarProductos() {
        try {
            
            String nombre = principal.getNombre();
            String precioStr = principal.getPrecio();
            boolean perecedero = principal.getPerecedero();

            if (nombre.isEmpty() || precioStr.isEmpty()) {
                principal.error("Completa todos los datos!");
                return; 
            }

           
            double precio = Double.parseDouble(precioStr);


            Producto objProducto = new Producto(nombre, precio, perecedero);

            String msm = gestionProductosGracia.agregarProductos(objProducto);
            principal.error(msm);
            if (msm.equals("Guardado exitosamente")) {
            principal.limpiar(); 
            principal.error("Datos correctos"); 
        }

    } catch (NumberFormatException e) {
        principal.error("Precio debe ser número.");
    } catch (Exception e) {
        principal.error("Error: " + e.getMessage());
    }
    }

    public void listarProductosRegistrados() {
        try {
            String msm = "";
            Producto[] productos = gestionProductosGracia.listarProductosRegistrados();

            if (productos != null && productos.length > 0) { 
                for (Producto producto : productos) {
                    if (producto != null) { 
                        msm += "Nombre: " + producto.getNombre() + "\n"
                                + "Precio: " + producto.getPrecio() + "\n"
                                + "Perecedero: " + producto.isPerecedero() + "\n\n"; 
                    }
                }
            } else {
                msm = "No hay datos para mostrar";
            }
            listarIU.mostrarDatos(msm);
        } catch (Exception e) {
            System.out.println("Error Controlador-listarProductosRegistrados: " + e);
        }
    }
    
}
