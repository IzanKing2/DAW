package com.empresa.model;

import java.time.LocalDate; // Importamos la clase LocalDate

public class Prestamo {
    // Atributos --------------------------
    private LocalDate fechaInicioPrestamo;
    private LocalDate fechaFinalPrestamo;
    private int bloqueo;
    // Atributo estatico
    private static LocalDate fechaDevolucion = null;
    // -----------------------------------------------

    // Constructor ------------------------------------------------------
    public Prestamo() {
        //this.fechaInicioPrestamo = LocalDate.now(); // Fecha actual
        this.fechaInicioPrestamo = LocalDate.of(2021, 1, 1); // Fecha de prueba 'ELIMINAR !!!!'
        //this.fechaFinalPrestamo = fechaInicioPrestamo.plusDays(30); // 30 días de plazo
        this.fechaFinalPrestamo = LocalDate.of(2021, 1, 31); // Fecha de prueba 'ELIMINAR !!!!'
        this.bloqueo = 0;
    }
    // ------------------------------------------------------------------------------------------------------------------

    // Getters ----------------------------------
    public LocalDate getFechaInicioPrestamo() {
        return this.fechaInicioPrestamo;
    }

    public LocalDate getFechaFinalPrestamo() {
        return this.fechaFinalPrestamo;
    }

    public int getBloqueo() {
        return this.bloqueo;
    }

    public static LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    // -------------------------------------------

    // Setters -----------------------------------------------------------
    public static void setFechaDevolucion(LocalDate fechaDevolucion) {
        Prestamo.fechaDevolucion = fechaDevolucion;
    }

    public void setBloqueo(int bloqueo) {
        this.bloqueo = bloqueo;
    }
    // -------------------------------------------------------------------
}
