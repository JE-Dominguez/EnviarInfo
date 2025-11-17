package com.example.enviarinfo;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public Persona(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public String getCorreo() { return correo; }
}
