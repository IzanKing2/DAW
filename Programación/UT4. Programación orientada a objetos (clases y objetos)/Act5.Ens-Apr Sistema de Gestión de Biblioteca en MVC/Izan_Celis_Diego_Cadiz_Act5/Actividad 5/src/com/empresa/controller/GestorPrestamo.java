package com.empresa.controller;

import java.time.LocalDate; // Importamos la clase LocalDate
import java.util.HashMap; // Importamos la clase HashMap

import com.empresa.model.Libro; // Importamos la clase Libro
import com.empresa.model.Prestamo; // Importamos la clase Prestamo
import com.empresa.model.Usuario; // Importamos la clase Usuario
import com.empresa.model.Libro.Estado; // Importamos la clase Estado

public class GestorPrestamo {
    // Atributos -----------------------------
    Prestamo prestamo = new Prestamo();
    GestorFecha gestorFecha = new GestorFecha();
    // -----------------------------------------------

    // Métodos ----------------------------------------------------------------------------------------------
    // Método para prestar libro
    public HashMap<Libro, LocalDate> prestarLibro(Usuario usuario, Libro libro) {
        if (libro.getCopias() <= 0 && libro.getEstado() == Estado.PRESTADO) { // Se valida si el libro ya está prestado
            System.out.println("- El libro '" + libro.getTitulo() + "' ya está prestado.");
            return null;
        }

        if (libro.getCopias() <= 0) { // Se valida que haya copias disponibles
            System.out.println("- No hay copias disponibles del libro '" + libro.getTitulo() + "'.");
            return null;
        }
        
        if (usuario.getCantidadLibrosPrestados() >= 3) { // Se valida que el usuario no tenga más de 3 libros prestados
            System.out.println("- El usuario '" + usuario.getNombre() + "' ha alcanzado el límite de libros prestados.");
            return null;
        }

        if (usuario.getListaLibrosPrestados().contains(libro)) { // Se valida si el usuario ya tiene el libro prestado
            System.out.println("- El usuario '" + usuario.getNombre() + "' ya tiene el libro '" + libro.getTitulo() + "' prestado.");
            return null;
        }

        LocalDate fechaPrestamo = prestamo.getFechaInicioPrestamo(); // Se obtiene la fecha de inicio del préstamo

        if (prestamo.getBloqueo() != 0) { // Se valida si el usuario tiene un bloqueo
            if (fechaPrestamo.isBefore(prestamo.getFechaFinalPrestamo().plusDays(prestamo.getBloqueo()))) {
                System.out.println("- El usuario '" + usuario.getNombre() + "' tiene un bloqueo de '" + prestamo.getBloqueo() + "' días.");
                return null;
            }
        }

        System.out.println("- El usuario '" + usuario.getNombre() + "' se le ha prestado el libro '" + libro.getTitulo() + "'.");
        usuario.getListaLibrosPrestados().add(libro);
        libro.setEstado(Estado.PRESTADO); // Se cambia el estado del libro a prestado
        usuario.setCantidadLibrosPrestados(usuario.getCantidadLibrosPrestados() + 1); // Se incrementa la cantidad de libros prestados
        libro.setCantidadCopiasDisponibles(libro.getCopias() - 1); // Se decrementa la cantidad de copias disponibles
        usuario.getListaPrestamos().put(libro, fechaPrestamo);
        return usuario.getListaPrestamos();
    }

    // Método para devolver libro
    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.getCantidadLibrosPrestados();
        if (usuario.getListaLibrosPrestados().contains(libro)) {
            usuario.getListaLibrosPrestados().remove(libro);
            usuario.getListaPrestamos().remove(libro);
            usuario.getListaLibrosDevueltos().add(libro);
            usuario.setCantidadLibrosPrestados(usuario.getCantidadLibrosPrestados() - 1); // Se decrementa la cantidad de libros prestados
            //prestamo.setFechaDevolucion(LocalDate.now());
            Prestamo.setFechaDevolucion(LocalDate.of(2021, 2, 25)); // Fecha de prueba 'ELIMINAR !!!!'
            usuario.getListaDevueltos().put(libro, Prestamo.getFechaDevolucion());
            libro.setCantidadCopiasDisponibles(libro.getCopias() + 1); // Se incrementa la cantidad de copias disponibles
            libro.setEstado(Libro.Estado.DISPONIBLE);
            gestorFecha.comprobarFecha(usuario, prestamo);
        }
    }
    // ---------------------------------------------------------------------------------------------------------------------
}
