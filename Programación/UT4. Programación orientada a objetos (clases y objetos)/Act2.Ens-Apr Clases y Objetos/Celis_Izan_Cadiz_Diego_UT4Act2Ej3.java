class Coche {
    // Propiedades
    String marca;
    String modelo;
    String color;
    String matricula;

    // Constructores
    Coche(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }
        // Constructor con 2 parametros
    Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = null;
        this.matricula = null;
    }
        // Constructor con 0 parametros
    Coche() {
        this.marca = null;
        this.modelo = null;
        this.color = null;
        this.matricula = null;
    }

    // Métodos
    void mostrarInformación() {
        System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Color: " + this.color + " | Matricula: " + this.matricula);
    }
}


public class Celis_Izan_Cadiz_Diego_UT4Act2Ej3 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Hyundai", "Tucson", "blanco", "JTK43234");
        Coche coche2 = new Coche("Hyundai", "Tucson");
        Coche coche3 = new Coche();

        coche1.mostrarInformación();
        coche2.mostrarInformación();
        coche3.mostrarInformación();
    }
}
