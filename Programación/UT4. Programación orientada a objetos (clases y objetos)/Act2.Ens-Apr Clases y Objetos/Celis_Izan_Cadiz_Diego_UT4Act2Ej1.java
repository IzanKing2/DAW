class Persona {
    // Propiedades
    String nombre;
    String apellido;
    String dni;

    // Constructor
    Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Métodos
    void identificarPersona() {
        System.out.println("La persona con el DNI: " + this.dni + " es '" + this.nombre + " " + this.apellido + "'");
    }

    void saludar() {
        System.out.println("'" + this.nombre + " " + this.apellido + "' te saluda !!");
    }
}


public class Celis_Izan_Cadiz_Diego_UT4Act2Ej1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Izan", "Celis Afonso", "54163650F");

        persona1.identificarPersona();
        persona1.saludar();
    }
}