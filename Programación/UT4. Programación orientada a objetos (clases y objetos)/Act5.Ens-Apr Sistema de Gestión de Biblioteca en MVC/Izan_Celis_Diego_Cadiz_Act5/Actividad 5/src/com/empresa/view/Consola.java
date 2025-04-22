package com.empresa.view;

import java.time.LocalDate;
import java.util.ArrayList; // Importamos la clase ArrayList
import java.util.HashMap;

import com.empresa.model.Libro; // Importamos la clase Libro
import com.empresa.model.Usuario;

public class Consola {
    // Método para imprimir un mensaje --------------
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
    // -----------------------------------------------

    // LIBROS --------------------------------------------------------------------------
    // Método para mostrar mensaje de libro añadido correctamente 
    public void añadirLibroMess(Libro libro) {
        imprimir(" - " + "'" + libro.getTitulo() + "'" + " añadido correctamente.");
    }

    // Método para mostrar libros prestados
    public void librosPrestadosMess(HashMap<Libro, LocalDate> listaPrestamos) {
        for (Libro libro : listaPrestamos.keySet()) {
            imprimir(
                "Fecha de préstamo: " + listaPrestamos.get(libro) +
                " | Título: " + libro.getTitulo() +
                " | Autor: " + libro.getAutor()
            );
        }
    }

    // Método para mostrar libros devueltos
    public void librosDevueltosMess(HashMap<Libro, LocalDate> listaDevueltos) {
        for (Libro libro : listaDevueltos.keySet()) {
            imprimir(
                "Fecha de devolución: " + listaDevueltos.get(libro) +
                " | Título: " + libro.getTitulo() +
                " | Autor: " + libro.getAutor()
            );
        }
    }

    // Método para mostrar un único libro
    public void resumenLibro(Libro libro) {
        imprimir(
            libro.getLibroId() + 
            " | Título: " + libro.getTitulo() + 
            " | Autor: " + libro.getAutor() + 
            " | Año: " + libro.getAño() + 
            " | Editorial: " + libro.getEditorial() +
            " | Género: " + libro.getGenero() + 
            " | Copias: " + libro.getCopias() +
            " | Estado: " + libro.getEstado()
        );
    }

    // Método statico para mostrar el resumen de los libros 
    public void resumenLibros(ArrayList<Libro> listaLibros) {
        for (Libro libro : listaLibros) { // Recorremos la lista de libros
            imprimir(
                libro.getLibroId() + 
                " | Título: " + libro.getTitulo() + 
                " | Autor: " + libro.getAutor() + 
                " | Año: " + libro.getAño() + 
                " | Editorial: " + libro.getEditorial() +
                " | Género: " + libro.getGenero() + 
                " | Copias: " + libro.getCopias() +
                " | Estado: " + libro.getEstado()
            );
        }
    }
    // ---------------------------------------------------------------------------------

    // USUARIOS --------------------------------------------------------------------------
    // Método para mostrar mensaje de usuario añadido correctamente 
    public void añadirUsuarioMess(Usuario usuario) {
        imprimir(" - " + "'" + usuario.getNombre() + "'" + " añadido correctamente.");
    }

    // Método para mostrar un único usuario
    public void resumenUsuario(Usuario usuario) {
        imprimir(usuario.getUsuarioId() + " | Nombre: " + usuario.getNombre());
        imprimir("Libros Prestados:");
        librosPrestadosMess(usuario.getListaPrestamos());
        imprimir("Libros Devueltos:");
        librosPrestadosMess(usuario.getListaDevueltos());
        imprimir("");
    }

    // Método par mostrar el resumen de los usuarios
    public void resumenUsuarios(ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            imprimir(usuario.getUsuarioId() + " | Nombre: " + usuario.getNombre());
            imprimir("Libros Prestados:");
            resumenLibros(usuario.getListaLibrosPrestados());
            imprimir("Libros Devueltos:");
            resumenLibros(usuario.getListaLibrosDevueltos());
            imprimir("");
        }
    }
    // ---------------------------------------------------------------------------------
}
