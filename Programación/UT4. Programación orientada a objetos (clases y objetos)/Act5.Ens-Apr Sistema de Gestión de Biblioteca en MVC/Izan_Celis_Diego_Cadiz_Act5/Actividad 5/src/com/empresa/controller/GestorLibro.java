package com.empresa.controller;

import java.util.ArrayList;
import com.empresa.model.Libro;

public class GestorLibro {
    // Atributos -------------------------
    private ArrayList<Libro> listaLibros;
    // -----------------------------------

    // Constructor -----------------------
    public GestorLibro() {
        this.listaLibros = new ArrayList<>();
    }
    // -----------------------------------

    // Métodos ----------------------------------------------------------------------------------------
    // Método para añadir libro
    public void añadirLibro(Libro libro) {
        listaLibros.add(libro);
    }

    // Método para buscar libro por titulo
    public Libro buscarLibroTitulo(String titulo) {
        Libro libroEncontrado = null;
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) { // Comparamos el titulo
                libroEncontrado = libro;
                return libroEncontrado;
            }
        }
        return libroEncontrado;
    }

        // Método para buscar libro por ISBN
        public Libro buscarLibroIsbn(int libroId) {
            Libro libroEncontrado = null;
            for (Libro libro : listaLibros) {
                if (libro.getLibroId() == libroId) {
                    libroEncontrado = libro;
                    return libroEncontrado;
                }
            }
            return libroEncontrado;
        }

    // Método para buscar libro por genero
    public ArrayList<Libro> buscarLibroGenero(String genero) {
        ArrayList<Libro> libros = new ArrayList<>(); // Lista de libros
        for (Libro libro : listaLibros) { // Recorremos la lista de libros
            if (libro.getGenero().toString().equalsIgnoreCase(genero)) { // Comparamos el genero
                libros.add(libro);
            }
        }
        return libros;
    }
    // -----------------------------------------------------------------------------------------------

    // Getters ---------------------------------
    public ArrayList<Libro> getListaLibros() {
        return this.listaLibros;
    }
    // -----------------------------------------
}
