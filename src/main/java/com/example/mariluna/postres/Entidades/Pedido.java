package com.example.mariluna.postres.Entidades;

import java.util.ArrayList;


public class Pedido {

    // Atributos privados del pedido
    private int id;
    private String fecha;
    private String estado;
    private double total;

    // Un pedido tiene varios productos
    private ArrayList<Producto> productos;


    public Pedido(int id, String fecha, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.total = 0;                    // empieza en 0, va sumando productos
        this.productos = new ArrayList<>(); // lista vacia al inicio
    }

    // Getters: para leer los atributos
    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public String getEstado() { return estado; }
    public double getTotal() { return total; }

    // Setters: para modificar los atributos
    public void setId(int id) { this.id = id; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setEstado(String estado) { this.estado = estado; }


    public void agregarProducto(Producto producto) {
        productos.add(producto);
        this.total += producto.getPrecio(); // acumula el precio de cada producto
        System.out.println("Producto agregado al pedido #" + id);
    }

    // PAra Mostrar el resumen del pedido en consola
    public void mostrarPedido() {
        System.out.println("=== Pedido #" + id + " ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado);
        System.out.println("Total: $" + total);
        System.out.println("Cantidad de productos: " + productos.size());
    }
}