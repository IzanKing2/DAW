import java.util.Scanner;


// ----- NÚMEROS PERFECTOS
public class Celis_Afonso_Izan_UT2Act4Ej1 {

    // Función que comprueba si el número es perfecto
    public static String perfecto(int num) {
        int result = 0;
        for (int i = 1; i < num - 1; i++) {
            if (num % i == 0) {
                result += i;
                System.out.println(i);
            }
        }
        if (result == num) {
            return "El número " + num + " es perfecto, ya que la suma de sus divisores da: " + result; // Si
        } else {
            return "El número " + num + " NO es perfecto, ya que la suma de sus divisores da: " + result; // No
        }
    }
    // ---------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num;
            do {
                System.out.print("Dame un número entero mayor que 0: ");
                num = scanner.nextInt();
                
            } while (num <= 0);

            System.out.println(perfecto(num));
            
            scanner.close();
        } catch (Exception e){
            System.out.println("Error!");
        }
    }
}