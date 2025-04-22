package com.empresa.controller;

import com.empresa.model.Prestamo; // Importamos la clase Prestamo
import com.empresa.model.Usuario; // Importamos la clase Usuario

public class GestorFecha {
    // Métodos ----------------------------------------------------------------------------------------------
    // Método para mostrar la fecha de inicio, final y de devolución del préstamo
    public void mostrarFecha(Usuario usuario, Prestamo prestamo) {
        System.out.println("Fecha de inicio del préstamo: " + prestamo.getFechaInicioPrestamo());
        System.out.println("Fecha de devolución del préstamo: " + prestamo.getFechaFinalPrestamo());
        System.out.println("Fecha de devolución del libro: " + Prestamo.getFechaDevolucion());
    }

    // Método para comprobar si el libro ha sido devuelto a tiempo o con retraso
    public void comprobarFecha(Usuario usuario, Prestamo prestamo) {
        if (Prestamo.getFechaDevolucion() == null) {
            System.out.println("El libro aún no ha sido devuelto.");
        } else if (Prestamo.getFechaDevolucion().isAfter(prestamo.getFechaFinalPrestamo())) { // Se compara si la fecha de devolución es posterior a la fecha final del préstamo
            System.out.println("El libro ha sido devuelto con retraso.");
            prestamo.setBloqueo(7); // Se bloquea al usuario por 7 días
        } else {
            System.out.println("El libro ha sido devuelto a tiempo.");
        }
    }
    // -------------------------------------------------------------------------------------------------------
}
