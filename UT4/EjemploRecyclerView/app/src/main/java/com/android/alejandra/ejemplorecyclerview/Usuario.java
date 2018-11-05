package com.android.alejandra.ejemplorecyclerview;

public class Usuario {
    private String nombre, apellidos, dirección;
    private long telefono;
    private int fotoPerfil;
    private int edad;


    public Usuario(String nombre, String apellidos, String dirección, long telefono, int fotoPerfil, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirección = dirección;
        this.telefono = telefono;
        this.fotoPerfil = fotoPerfil;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
