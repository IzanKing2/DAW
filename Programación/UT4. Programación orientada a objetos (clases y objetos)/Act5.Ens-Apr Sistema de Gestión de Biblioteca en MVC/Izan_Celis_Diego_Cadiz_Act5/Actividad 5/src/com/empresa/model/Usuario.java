package com.empresa.model;

import java.time.LocalDate; // Importamos la clase LocalDate
import java.util.ArrayList; // Importamos la clase ArrayList
import java.util.HashMap; // Importamos la clase HashMap

public class Usuario {
    // Atributos ---------------
    private int usuarioId;
    private String nombre;
    private ArrayList<Libro> listaLibrosPrestados;
    private HashMap<Libro, LocalDate> listaPrestamos;
    private int cantidadLibrosPrestados;
    private ArrayList<Libro> listaLibrosDevueltos;
    private HashMap<Libro, LocalDate> listaDevueltos;
    // Atributo estático
    private static int generadorId = 1;
    // -------------------------------------------------

    // Constructor -----------------------------------------
    public Usuario(String nombre) {
        if (nombre == null || nombre.isEmpty()) { // Si el nombre es nulo o vacío
            throw new IllegalArgumentException("El nombre del usuario no puede ser nulo o vacío.");
        }
        this.listaPrestamos = new HashMap<>();
        this.listaDevueltos = new HashMap<>();
        this.cantidadLibrosPrestados = 0;
        this.usuarioId = generadorId++;
        this.nombre = nombre;
        this.listaLibrosPrestados = new ArrayList<>();
        this.listaLibrosDevueltos = new ArrayList<>();
    }
    // -------------------------------------------------------

    // Getters ---------------------------------
    public int getUsuarioId() {
        return this.usuarioId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Libro> getListaLibrosPrestados() {
        return this.listaLibrosPrestados;
    }

    public ArrayList<Libro> getListaLibrosDevueltos() {
        return this.listaLibrosDevueltos;
    }

    public int getCantidadLibrosPrestados() {
        return this.cantidadLibrosPrestados;
    }

    public HashMap<Libro, LocalDate> getListaPrestamos() {
        return this.listaPrestamos;
    }

    public HashMap<Libro, LocalDate> getListaDevueltos() {
        return this.listaDevueltos;
    }
    // -------------------------------------------------------

    // Setters -------------------------------------------------------------
    public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
        this.cantidadLibrosPrestados = cantidadLibrosPrestados;
    }
    // -----------------------------------------------------------------------
}
