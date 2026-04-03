package com.example.mariluna.postres.Entidades;

import java.util.ArrayList;

// Cliente hereda de Usuario usando extends

public class Cliente extends Usuario {

    // Atributos propios de Cliente (ademas de los que ya tiene Usuario)
    private String telefono;
    private String direccion;

    // Lista de pedidos del cliente (un cliente puede tener muchos pedidos)
    private ArrayList<Pedido> pedidos;

    // this: llama al constructor de Usuario con "super"
    // y agrega los datos propios de Cliente
    public Cliente(int id, String nombre, String correo, String contrasena,
                   String telefono, String direccion) {
        // super() llama al constructor de la clase madre (Usuario)
        super(id, nombre, correo, contrasena);
        this.telefono = telefono;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
    }

    // Getters de los atributos propios de Cliente
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }

    // Setters de los atributos propios de Cliente
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    // Metodo para actualizar telefono y direccion al mismo tiempo
    public void actualizacionDatos(String nuevoTelefono, String nuevaDireccion) {
        this.telefono = nuevoTelefono;
        this.direccion = nuevaDireccion;
        System.out.println("Datos actualizados correctamente.");
    }

    // Agrega un pedido a la lista del cliente
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado al cliente " + getNombre());
    }

    // Este metodo es obligatorioporque Usuario lo declaro como abstracto
    // Aqui lo implementamos a la manera de Cliente
    @Override
    public void mostrarInfo() {
        System.out.println("*** Cliente ***");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
    }
}