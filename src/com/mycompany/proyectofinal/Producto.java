package com.mycompany.proyectofinal;

public class Producto {
    // Atributos de la clase com.mycompany.proyectofinal.Producto
    private int id;
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;


    /**
     * Constructor de la clase com.mycompany.proyectofinal.Producto.
     *
     * @param id       El ID del producto.
     * @param nombre   El nombre del producto.
     * @param cantidad La cantidad del producto.
     * @param precio   El precio del producto.
     */

    // Constructor
    public Producto(int id, String nombre, int cantidad, double precio) {

            this.id = id;
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;

    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar información del producto
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);

    }
    public String getDescripcion() {
        return descripcion;
    }
}

