package com.example.mariluna.postres.Entidades;

public class Producto {

    private int idProducto;
    private String nombre;
    private String categoria;
    private double precio;
    private String descripcion;
    private int cantidadDisponible;

    public Producto(int idProducto, String nombre, String categoria,
                     double precio, String descripcion, int cantidadDisponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (!categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (!descripcion.isEmpty()) {
            this.descripcion = descripcion;
        }
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        if (cantidadDisponible >= 0) {
            this.cantidadDisponible = cantidadDisponible;
        }
    }

    public void mostrarDetalles() {
        System.out.println("ID: " + idProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Stock: " + cantidadDisponible);
        System.out.println("-----------------------------");
    }

    public boolean hayDisponibilidad(int cantidad) {
        return cantidadDisponible >= cantidad;
    }

    public void venderProducto(int cantidad) {
        if (hayDisponibilidad(cantidad)) {
            cantidadDisponible -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + cantidadDisponible);
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            cantidadDisponible += cantidad;
            System.out.println("Nuevo stock: " + cantidadDisponible);
        }
    }
}
