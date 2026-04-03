package com.example.mariluna.postres;
import com.example.mariluna.postres.Entidades.Administrador;
import com.example.mariluna.postres.Entidades.Producto;
import com.example.mariluna.postres.Entidades.Cliente;
import com.example.mariluna.postres.Entidades.Pedido;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Producto> catalogo = new ArrayList<>();

        Administrador admin = new Administrador(
                1,
                "Camilo",
                "camilo@gmail.com",
                "1234"
        );

        Producto p1 = new Producto(
                1,
                "Cheesecake",
                "Torta",
                20000,
                "Postre de frutos rojos",
                10
        );

        Producto p2 = new Producto(
                2,
                "Brownie",
                "Chocolate",
                8000,
                "Brownie con helado",
                15
        );

        admin.agregarProducto(catalogo, p1);
        admin.agregarProducto(catalogo, p2);

        admin.mostrarCatalogo(catalogo);

        admin.actualizarProducto(catalogo, 1, "Cheesecake Premium", 25000, 20);

        admin.eliminarProducto(catalogo, 2);

        System.out.println("CATÁLOGO FINAL");
        admin.mostrarCatalogo(catalogo);

        // Parte actualizada

        System.out.println("\n=============================");

        // Creamos un objeto Cliente pasandole todos sus datos
        Cliente cliente1 = new Cliente(
                1,
                "Valentina",
                "valentina.sena@gmail.com",
                "5678",
                "300-111-2233",
                "Calle 2, Cali"
        );

        // Llamamos al metodo mostrarInfo() que Cliente heredo de Usuario
        cliente1.mostrarInfo();

        System.out.println();

        // Actualizamos telefono y direccion del cliente
        cliente1.actualizacionDatos("300-999-8877", "Carrera 5, Cali");
        System.out.println("Telefono actualizado: " + cliente1.getTelefono());

        System.out.println();

        // Creamos un pedido con id, fecha y estado
        Pedido pedido1 = new Pedido(1, "2025-04-01", "pendiente");

        // Agregamos un producto al pedido, esto suma el precio al total
        pedido1.agregarProducto(p1);

        // Mostramos el resumen del pedido
        pedido1.mostrarPedido();

        // Asociamos el pedido al cliente
        cliente1.agregarPedido(pedido1);
    }
}