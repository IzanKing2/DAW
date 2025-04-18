import java.util.Arrays;
import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act2Ej1 {
    /**
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String palabra1, palabra2;

            System.out.print("Introduce una palabra: ");
            palabra1 = sc.nextLine();
            System.out.print("Introduce otra palabra: ");
            palabra2 = sc.nextLine();

            String palabra1Mod = palabra1.replace(" ", "").toLowerCase(); // Eliminamos los espacios y ponemos todo en minúscula
            String palabra2Mod = palabra2.replace(" ", "").toLowerCase(); // Eliminamos los espacios y ponemos todo en minúscula
            String[] palabra1List = palabra1Mod.split("");
            String[] palabra2List = palabra2Mod.split("");
            Arrays.sort(palabra1List);
            Arrays.sort(palabra2List);

            // Verifica si son anagramas o no
            if (esAnagrama(palabra1List, palabra2List)) {                                                   // Son anagramas
                System.out.println(palabra1 + " y " + palabra2 + " son Anagramas.");                    
            } else {                                                                                        // No lo son
                System.out.println(palabra1 + " y " + palabra2 + " NO son Anagramas.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }


    /**
     *  Método que comprueba si las palabras son anagramas
     * @param word1
     * @param word2
     * @return boolean
     */
    public static boolean esAnagrama(String[] word1, String[] word2) {
        if (word1.length != word2.length) {
            return false;
        }
        if (Arrays.equals(word1, word2)) {
            return true;
        }
        return false;
    }
}
