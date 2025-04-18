import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act1Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion, continuar = "no";


        do {
            int ronda = 1, puntos = 0, puntosMaquina = 0;

            while (ronda <= 5) {
                System.out.println("Ronda " + ronda + ":");
                int maquina = (int)((Math.random()* 3) + 1);
                String opcionMaquina = seleccionMaquina(maquina); // Eleccion de la máquina

                System.out.print("Elige: Piedra, Papel o Tijeras: ");
                opcion = sc.nextLine();
                System.out.println("Máquina eligió: " + opcionMaquina);


                if (opcion.toLowerCase().equals("piedra") && opcionMaquina.toLowerCase().equals("papel")) { // piedra vs papel -> papel
                    puntosMaquina++;
                    System.out.println("Resultado: ¡Perdiste esta ronda!\n");
                    System.out.println("---------------------------------\n");
                    ronda++;
                } else if (opcion.toLowerCase().equals("papel") && opcionMaquina.toLowerCase().equals("tijeras")) { // papel vs tijeras -> tijeras
                    puntosMaquina++;
                    System.out.println("Resultado: ¡Perdiste esta ronda!\n");
                    System.out.println("---------------------------------\n");
                    ronda++;
                } else if (opcion.toLowerCase().equals("tijeras") && opcionMaquina.toLowerCase().equals("piedra")) { // tijeras vs piedra -> piedra
                    puntosMaquina++;
                    System.out.println("Resultado: ¡Perdiste esta ronda!\n");
                    System.out.println("---------------------------------\n");
                    ronda++;
                } else if (opcion.toLowerCase().equals(opcionMaquina.toLowerCase())){ // Iguales
                    puntos++;
                    puntosMaquina++;
                    System.out.println("Resultado: ¡Empate!\n");
                    System.out.println("---------------------------------\n");
                    ronda++;
                } else {
                    puntos++;
                    System.out.println("Resultado: ¡Ganaste esta ronda!\n");
                    System.out.println("---------------------------------\n");
                    ronda++;
                }
            } 
            // Gana el jugador
            if (puntos > puntosMaquina) {
                System.out.println("Tú: " + puntos + " | Máquina: " + puntosMaquina);
                System.out.println("Ganaste despúes de 5 rondas.");
                System.out.print("¿Quieres jugar otra partida? (sí/no): ");
                System.out.println("\n");
                continuar = sc.nextLine();
            // Gana la máquina
            } else if (puntos < puntosMaquina) {
                System.out.println("Tú: " + puntos + " | Máquina: " + puntosMaquina);
                System.out.println("Perdiste despúes de 5 rondas.");
                System.out.print("¿Quieres jugar otra partida? (sí/no): ");
                System.out.println("\n");
                continuar = sc.nextLine();
            // Empate
            } else {
                System.out.println("Tú: " + puntos + " | Máquina: " + puntosMaquina);
                System.out.println("Es un empate despúes de 5 rondas.");
                System.out.print("¿Quieres jugar otra partida? (si/no): ");
                System.out.println("\n");
                continuar = sc.nextLine();
            }
        } while (continuar.toLowerCase().equals("si"));

        sc.close();
    }

    /**
     *  Método para generar 'piedra, papel o tijera' de la máquina
     * @param maquina
     * @return opcion
     */
    public static String seleccionMaquina(int maquina) {
        String opcion;
        switch (maquina) {
            case 1: opcion = "Piedra"; return opcion;
            case 2: opcion = "Papel"; return opcion;
            case 3: opcion = "Tijeras"; return opcion;
            default: return "Error!!";
        }
    }
}
