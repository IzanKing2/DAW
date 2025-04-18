import java.util.Scanner;


public class Celis_Afonso_Izan_UT3Act2Ej3 {
    /**
     *  Método principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String contraseña;

            System.out.print("- Contraseña: ");
            contraseña = sc.nextLine();

            String nivel_seguridad = evaluarContraseña(contraseña);
            System.out.println("Nivel de seguridad de la contraseña: " + nivel_seguridad);

            sc.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    /**
     *  Método para evaluar el nivel de seguridad de la contraseña
     * @param contraseña
     * @return debil, fuerte, media
     */
    public static String evaluarContraseña(String contraseña) {
        int length = contraseña.length();
        boolean hasUpperCase = contraseña.matches(".*[A-Z].*");
        boolean hasLowerCase = contraseña.matches(".*[a-z].*");
        boolean hasNumbers = contraseña.matches(".*[0-9].*");
        boolean hasSymbol = contraseña.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

        if (length < 8) {
            return "Débil";
        }

        if (hasLowerCase && hasUpperCase && hasNumbers && hasSymbol && length >= 12) {
            return "Fuerte";
        }

        if (hasLowerCase && hasUpperCase && hasNumbers && length >= 8) {
            return "Media";
        }

        return "Débil";
    }
}