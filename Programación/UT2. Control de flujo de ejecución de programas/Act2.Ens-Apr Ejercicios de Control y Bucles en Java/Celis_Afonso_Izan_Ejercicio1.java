import java.util.Scanner;

public class Celis_Afonso_Izan_Ejercicio1 {
    public static void main(String[] args) {
        int num, cont;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un número entero: ");
        num = scanner.nextInt();
        cont = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                ++cont;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n" + num + " tiene " + cont + " divisores.");
        scanner.close();
    }
}
