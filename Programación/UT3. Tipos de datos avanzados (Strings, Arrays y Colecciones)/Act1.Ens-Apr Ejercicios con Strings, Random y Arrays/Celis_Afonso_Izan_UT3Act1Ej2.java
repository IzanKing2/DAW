import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act1Ej2 {
    /**
     *  Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String texto, textoMod;
            String[] textoList;
            String textoInvertido = "";

            System.out.print("Dame un texto: ");
            texto = sc.nextLine();
            textoMod = texto.replace(" ", "").toLowerCase();
            textoList = textoMod.split("");

            for (int i = textoList.length - 1; i >= 0; i--) {
                textoInvertido = textoInvertido.concat(textoList[i]); // texto al revés
            }

            if (textoMod.equals(textoInvertido)) {
                System.out.println("La frase '" + texto + "' es un palíndromo");
            } else {
                System.out.println("La frase '" + texto + "' NO es un palíndromo");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }
}
