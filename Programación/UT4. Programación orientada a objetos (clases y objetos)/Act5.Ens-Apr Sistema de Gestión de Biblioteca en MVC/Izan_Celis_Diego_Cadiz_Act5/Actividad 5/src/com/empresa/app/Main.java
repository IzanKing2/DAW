package com.empresa.app;

import com.empresa.view.Consola; // Importamos la clase Consola

import com.empresa.controller.GestorLibro; // Importamos la clase GestorLibro
import com.empresa.controller.GestorPrestamo;
import com.empresa.controller.GestorUsuarios; // Importamos la clase GestorUsuarios

import com.empresa.model.Libro; // Importamos la clase Libro
import com.empresa.model.Usuario; // Importamos la clase Usuario


public class Main {
    public static void main(String[] args) {
        // Crear consola
        Consola consola = new Consola(); // Creamos un objeto de la clase Consola

        // Gestores
        GestorLibro gestorLibro = new GestorLibro(); // Creamos un objeto de la clase GestorLibro
        GestorUsuarios gestorUsuarios = new GestorUsuarios(); // Creamos un objeto de la clase GestorUsuarios
        GestorPrestamo gestorPrestamo = new GestorPrestamo(); // Creamos un objeto de la clase GestorPrestamo

        Consola.imprimir("\n_________ AÑADIENDO LIBROS _________\n");

        // Libros -----------------------------------------------------------------------------------------------------------------------------------------------------
        Libro libro1 = new Libro("El Quijote", "Cervantes", 1954, "Venturus", Libro.Genero.FANTASIA);
        Libro libro2 = new Libro("Harry Potter y el caliz de fuego", "J.K. Rowling", 2000, "Salamanca", Libro.Genero.FANTASIA);
        Libro libro3 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, "Venturus", Libro.Genero.FANTASIA);
        Libro libro4 = new Libro("El código Da Vinci", "Dan Brown", 2003, "Ibira", Libro.Genero.NOVELA);
        Libro libro5 = new Libro("El nombre del viento", "Patrick Rothfuss", 2007, "Ibira", Libro.Genero.FANTASIA);
        // -----------------------------------------------------------------------------------------------------------------------------------------------------

        // Añadimos libros ----------------------------------
        gestorLibro.añadirLibro(libro1);
        consola.añadirLibroMess(libro1);
        gestorLibro.añadirLibro(libro2);
        consola.añadirLibroMess(libro2);
        gestorLibro.añadirLibro(libro3);
        consola.añadirLibroMess(libro3);
        gestorLibro.añadirLibro(libro4);
        consola.añadirLibroMess(libro4);
        gestorLibro.añadirLibro(libro5);
        consola.añadirLibroMess(libro5);
        // --------------------------------------------------

        // Resumen de libros ---------------------------------------
        Consola.imprimir("\n__Lista de libros__:");
        consola.resumenLibros(gestorLibro.getListaLibros());
        // ----------------------------------------------------------

        Consola.imprimir("\n_________ AÑADIENDO USUARIOS _________\n");

        // Usuarios -----------------------------------------------------------------------------------------------------------------------------------------------------
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Pedro");
        Usuario usuario3 = new Usuario("Ana");
        // -----------------------------------------------------------------------------------------------------------------------------------------------------

        // Añadimos usuarios ----------------------------------
        gestorUsuarios.añadirUsuario(usuario1);
        consola.añadirUsuarioMess(usuario1);
        gestorUsuarios.añadirUsuario(usuario2);
        consola.añadirUsuarioMess(usuario2);
        gestorUsuarios.añadirUsuario(usuario3);
        consola.añadirUsuarioMess(usuario3);
        // --------------------------------------------------

        // Resumen de usuarios ---------------------------------------
        Consola.imprimir("\n__Lista de usuarios__:");
        consola.resumenUsuarios(gestorUsuarios.getListaUsuarios());
        // ----------------------------------------------------------

        Consola.imprimir("\n_________ BUSCANDO LIBROS _________");

        // Buscar libro por titulo ---------------------------------------------------------
        Consola.imprimir("\nBuscando libro 'El Quijote'...");
        if (gestorLibro.buscarLibroTitulo("El Quijote") != null) {
            Consola.imprimir("Libro encontrado:");
            consola.resumenLibro(gestorLibro.buscarLibroTitulo("El Quijote"));
        } else {
            Consola.imprimir("Libro no encontrado.");
        }
        // ------------------------------------------------------------------------------------

        // Buscar libro por ISBN ---------------------------------------------------------
        Consola.imprimir("\nBuscando libro con ISBN 2...");
        if (gestorLibro.buscarLibroIsbn(2) != null) {
            Consola.imprimir("Libro encontrado:");
            consola.resumenLibro(gestorLibro.buscarLibroIsbn(2));
        } else {
            Consola.imprimir("Libro no encontrado.");
        }

        // Buscar libro por genero ---------------------------------------------------------
        Consola.imprimir("\nBuscando libros de genero 'Fantasia'...");
        consola.resumenLibros(gestorLibro.buscarLibroGenero("Fantasia"));

        Consola.imprimir("\n_________ REVISANDO PRESTADOS _________");

        // Comprobamos si un usuario tiene un libro prestado ------------------------------------------------------
        Consola.imprimir("\nComprobando si el usuario Juan tiene el libro 'El Quijote' prestado...");
        if (gestorUsuarios.tieneLibroPrestado(usuario1, libro1)) {
            Consola.imprimir("El usuario Juan tiene el libro 'El Quijote' prestado.");
        } else {
            Consola.imprimir("El usuario Juan no tiene el libro 'El Quijote' prestado.");
        }
        // --------------------------------------------------------------------------------------------------------

        Consola.imprimir("\n_________ PRESTAMOS _________");

        // Mostrar libros ------------------------------------------------------
        Consola.imprimir("\n__Lista de libros__:");
        consola.resumenLibros(gestorLibro.getListaLibros());
        // -------------------------------------------------------

        // Prestamos ------------------------------------------
        Consola.imprimir("\nPrestamos de libros:");
        gestorPrestamo.prestarLibro(usuario1, libro1);
        gestorPrestamo.prestarLibro(usuario2, libro1);
        gestorPrestamo.prestarLibro(usuario3, libro1);
        // ---------------------------------------------------

        // Prestamos ------------------------------------------
        Consola.imprimir("\nPrestamos de libros:");
        gestorPrestamo.prestarLibro(usuario1, libro2);
        gestorPrestamo.prestarLibro(usuario1, libro4);
        gestorPrestamo.prestarLibro(usuario1, libro3);
        gestorPrestamo.prestarLibro(usuario1, libro4);
        // ---------------------------------------------------

        // Resumen de usuario 'Juan' ---------------------------------------
        Consola.imprimir("\n__Resumen de usuario 'Juan'__:");
        consola.resumenUsuario(gestorUsuarios.buscarUsuarioNombre("Juan"));

        // Resumen de usuario 'Pedro' ---------------------------------------
        Consola.imprimir("\n__Resumen de usuario 'Pedro'__:");
        consola.resumenUsuario(gestorUsuarios.buscarUsuarioNombre("Pedro"));
        // --------------------------------------------------------------------------------------

        Consola.imprimir("\n_________ DEVOLUCIONES _________");

        // Devoluciones ----------------------------------------------------------------------
        Consola.imprimir("\nDevoluciones de libros:");
        gestorPrestamo.devolverLibro(usuario1, libro1);

        // Resumen de usuario 'Juan' ---------------------------------------
        Consola.imprimir("\n__Resumen de usuario 'Juan'__:");
        consola.resumenUsuario(gestorUsuarios.buscarUsuarioNombre("Juan"));
        // --------------------------------------------------------------------------------------

        // Prestamo de libro que ya está prestado ------------------------------------------------------
        Consola.imprimir("\nPrestamo de libro que ya está prestado:");
        gestorPrestamo.prestarLibro(usuario1, libro1);
        // --------------------------------------------------------------------------------------------------------
    }
}