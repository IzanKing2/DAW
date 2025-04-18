import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act1Ej1 {
    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String texto;
            int vocales = 0;
            int a = 0, e = 0, i = 0, o = 0, u = 0;

            System.out.print("Dame un texto: ");
            texto = sc.nextLine().toLowerCase();
            String[] textoList =  texto.split(""); // String -> lista
            
            for (String letra : textoList) { // Itera por cada palabra
                switch (letra) {
                    case "a": a++; vocales++; break;
                    case "e": e++; vocales++; break;
                    case "i": i++; vocales++; break;
                    case "o": o++; vocales++; break;
                    case "u": u++; vocales++; break;
                }
            }

            System.out.println("Número total de vocales: " + vocales);
            System.out.println("Número de 'a': " + a);
            System.out.println("Número de 'e': " + e);
            System.out.println("Número de 'i': " + i);
            System.out.println("Número de 'o': " + o);
            System.out.println("Número de 'u': " + u);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }
}