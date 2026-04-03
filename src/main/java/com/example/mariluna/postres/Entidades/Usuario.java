package com.example.mariluna.postres.Entidades;

// Esta es la clase madre (padre) de la que van a heredar Cliente y Administrador
// Es abstract porque no se puede crear un objeto Usuario directamente,
// solo se usa como base para las otras clases
public abstract class Usuario {

    // Atributos privados: solo se pueden leer/modificar con getters y setters
    // Esto se llama encapsulamiento
    private int id;           // numero unico que identifica al usuario
    private String nombre;    // nombre completo
    private String correo;    // correo electronico para iniciar sesion
    private String contrasena; // clave de acceso

    // this: se ejecuta automaticamente cuando se crea un objeto
    public Usuario(int id, String nombre, String correo, String contrasena) {
        this.id = id;              // "this" se refiere al atributo de la clase
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Getters: metodos para Leer los atributos desde otras clases
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getContrasena() { return contrasena; }

    // Setters: metodos para Mpdificar los atributos desde otras clases
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    // Metodo abstracto:cada clase hija debe implementarlo
    // Cliente lo implementara a su manera, Administrador a la suya
    public abstract void mostrarInfo();
}