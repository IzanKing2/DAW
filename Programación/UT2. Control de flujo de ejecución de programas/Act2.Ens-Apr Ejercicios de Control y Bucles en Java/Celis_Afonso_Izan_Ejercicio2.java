import java.util.Scanner;

public class Celis_Afonso_Izan_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, facto;

        System.out.print("Dame un número entero: ");
        num = scanner.nextInt();
        facto = 1;

        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        System.out.println("El factorial de " + num + " es: " + facto);

        scanner.close();
    }
}
