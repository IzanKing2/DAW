package com.empresa.model;

public class Libro {
    // Enum estado --------
    public enum Estado {
        DISPONIBLE,
        PRESTADO,
        RESERVADO;
    }
    // ----------------

    // Enum genero --------
    public enum Genero {
        NOVELA,
        CIENCIA_FICCION,
        HISTORIA,
        FANTASIA,
        MISTERIO,
        INFANTIL,
        POSEIDA,
        OTRO;
    }
    // ----------------

    // Atributos --------------
    private int libroId;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private Genero genero;
    private int cantidadCopias;
    private int cantidadCopiasDisponibles;
    private Estado estado;
    // Atributo estatico
    private static int generadorId = 1;
    // --------------------------------------------------------------

    // Constructor ------------------------------------------------------------------------------------
    public Libro(String titulo, String autor, int añoPublicacion, String editorial, Genero genero) {
        this.libroId = generadorId++;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.genero = genero;
        this.cantidadCopias = (int)(Math.random() * 3)  + 1;
        this.cantidadCopiasDisponibles = this.cantidadCopias;
        this.estado = Estado.DISPONIBLE;
    }
    // ------------------------------------------------------------------------------------------------

    // Getters --------------------------
    public int getLibroId() {
        return this.libroId;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public int getCopiasRandom() {
        return this.cantidadCopias;
    }

    public String getGenero() {
        return this.genero.toString();
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAño() {
        return this.añoPublicacion;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public int getCopias() {
        return this.cantidadCopiasDisponibles;
    }
    // --------------------------------------------

    // Setters -----------------------------------
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setCantidadCopiasDisponibles(int cantidadCopiasDisponibles) {
        this.cantidadCopiasDisponibles = cantidadCopiasDisponibles;
    }
    // --------------------------------------------------------------------------
}