class Libro {
    // Propiedades
    String titulo;
    int id;
    String autor;
    String genero;

    // Constructor
    Libro(String titulo, int id, String autor, String genero) {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.genero = genero;
    }

    Libro() {
        this("unknow", -1, "unknow", "unknow");
    }

    // Métodos
    void mostrarInformación() {
        System.out.println("Titulo: " + this.titulo + " | ID: " + this.id + " | Autor: " + this.autor + " | Genero: " + this.genero);
    }

    void cambiarGenero(String genero) {
        this.genero = genero;
    }
}


public class Celis_Izan_Cadiz_Diego_UT4Act2Ej4 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Don Quijote", 1234, "Cervantes", "Medieval");
        Libro libro2 = new Libro();

        libro1.mostrarInformación();
        System.out.println();
        libro1.cambiarGenero("Aventura");
        libro1.mostrarInformación();
        
        System.out.println();
        libro2.mostrarInformación();
    }
}
