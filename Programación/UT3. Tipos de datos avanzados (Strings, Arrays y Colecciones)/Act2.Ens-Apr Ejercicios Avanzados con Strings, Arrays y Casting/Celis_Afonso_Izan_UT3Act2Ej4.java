import java.util.Random;
import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act2Ej4 {
    /**
     *  Método principal
     * @param args
    */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int length;

            do {
                System.out.print("Longitud de la contraseña: ");
                length = sc.nextInt();
            } while (length < 6 | length > 72);

            String contraseña_generada = generadorDeContraseñas(length);
            System.out.println("Contraseña generada: " + contraseña_generada);
            sc.close();
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }

    public static String generadorDeContraseñas(int length) {
        // Caracteres permitidos
        String uppercase = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnñopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "#$%&@!?";

        Random random = new Random();

        String password = "";
        int i = 0;

        while (i < length) {
            
            password += uppercase.charAt(random.nextInt(uppercase.length()));
            i++;
            if (i >= length) {
                break;
            }
            password += lowercase.charAt(random.nextInt(lowercase.length()));
            i++;
            if (i >= length) {
                break;
            }
            password += numbers.charAt(random.nextInt(numbers.length()));
            i++;
            if (i >= length) {
                break;
            }
            password += symbols.charAt(random.nextInt(symbols.length()));
            i++;
        }
        return password;
    }
}
