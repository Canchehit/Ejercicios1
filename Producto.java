/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producto;

/**
 *
 * @author luisa
 */
public class Producto {

  private String codigo; 
    private String nombre; 
    private double precio;  

    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); 
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 1200);
        p1.mostrarInformacion();

        p1.setPrecio(-500); 
        p1.setPrecio(1000); 
        p1.mostrarInformacion();
    }
}
