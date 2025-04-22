class Libro {
    // Propiedades
    String genero;
    String titulo;
    String autor;
    int paginas;

    // Constructor
    Libro(String genero, String titulo, String autor, int paginas) {
        this.genero = genero;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Métodos
    /**
     *  Método para mostrar información
     */
    void mostrarInformacion() {
        System.out.println("Genero: " + genero + " | Titulo: " + titulo + " | Autor: " + autor);
    }

    /**
     *  Método para mostrar el número de páginas
     */
    void mostrarPaginas() {
        System.out.println("Número de páginas: " + paginas);
    }

    /**
     *  Método para modificar el genero
     * @param generoMod
     */
    void modificarGenero(String generoMod) {
        genero = generoMod;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Aventura", "Don Quijote", "Cervantes", 400);
        libro1.mostrarInformacion();
        libro1.mostrarPaginas();
        System.out.println("");
        libro1.modificarGenero("Acción");
        libro1.mostrarInformacion();
    }
}