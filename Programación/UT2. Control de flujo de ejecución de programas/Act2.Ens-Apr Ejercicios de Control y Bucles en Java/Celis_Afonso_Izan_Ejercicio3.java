import java.util.Scanner;

public class Celis_Afonso_Izan_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = 2322;
        int pass_user;
        int intentos = 3;

        do {
            System.out.print("Contraseña: ");
            pass_user = scanner.nextInt();
            if (pass_user == password) {
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos--;
                System.out.println("Acceso denegado, intentos: " + intentos);
            }
        } while (intentos > 0);

        scanner.close();
    }
}
