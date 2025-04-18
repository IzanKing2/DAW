import java.util.Scanner;

public class Celis_Afonso_Izan_Act3Ejercicio2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int next, num;
            int pares = 0;
            int impares = 0;

            do {
                num = (int)(Math.random() * 200);
                if (num % 2 == 0) {
                    pares ++;
                } else {
                    impares ++;
                }
                System.out.println(num);
                System.out.print("Quieres continuar(1:Si, 2:No): ");
                next = scanner.nextInt();
            } while (next == 1);

            System.out.println("\n__RESULTADOS__");
            System.out.println("Pares: " + pares);
            System.out.println("Impares: " + impares);
            scanner.close();

        } catch (Exception e) {
            System.out.println("Error! Carácter inválido");
        }
    }
}
