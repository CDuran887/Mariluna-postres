package com.example.mariluna.postres.Entidades;

import java.util.ArrayList;

public class Administrador {

    private int idAdmin;
    private String nombre;
    private String correo;
    private String contrasena;

    public Administrador(int idAdmin, String nombre, String correo, String contrasena) {
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "idAdmin=" + idAdmin +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }

    public void agregarProducto(ArrayList<Producto> catalogo, Producto producto) {
        catalogo.add(producto);
        System.out.println("Producto agregado por el administrador: " + nombre);
    }

    public void mostrarCatalogo(ArrayList<Producto> catalogo) {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }

        for (Producto producto : catalogo) {
            producto.mostrarDetalles();
        }
    }

    public Producto buscarProducto(ArrayList<Producto> catalogo, int idProducto) {
        for (Producto producto : catalogo) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        return null;
    }

    public void actualizarProducto(ArrayList<Producto> catalogo, int idProducto,
                                   String nuevoNombre, double nuevoPrecio, int nuevoStock) {

        Producto producto = buscarProducto(catalogo, idProducto);

        if (producto != null) {
            producto.setNombre(nuevoNombre);
            producto.setPrecio(nuevoPrecio);
            producto.setCantidadDisponible(nuevoStock);
            System.out.println("Producto actualizado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(ArrayList<Producto> catalogo, int idProducto) {
        Producto producto = buscarProducto(catalogo, idProducto);

        if (producto != null) {
            catalogo.remove(producto);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}