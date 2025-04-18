import java.util.Arrays;
import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act1Ej4 {
    /**
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int año, total = 0;

            System.out.print("Introduce un año: ");
            año = sc.nextInt();
            String añosBisiestos = "";


            for (int i = año; i < año + 10; i++) {
                if (i % 4 == 0) {
                    System.out.println(i); // Muestra el año bisiesto
                    total++;
                    añosBisiestos = añosBisiestos  + i + " ";
                }
            }

            String[] añosBisiestosList = añosBisiestos.split(" "); // Guardamos los años en array
            System.out.println("Número toral de años bisiestos: " + total);
            System.out.println("Años bisiestos lista: " + Arrays.toString(añosBisiestosList));

            sc.close();
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }
}