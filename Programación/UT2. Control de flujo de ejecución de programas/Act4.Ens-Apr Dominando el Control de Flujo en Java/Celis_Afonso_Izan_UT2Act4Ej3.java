import java.util.Scanner;


// ---- CAJERO AUTOMÁTICO
public class Celis_Afonso_Izan_UT2Act4Ej3 {
    public static void menu() {
        System.out.println("\n___MENU DE OPCIONES___:");
        System.out.println("1. Consultar saldo.");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Depositar dinero.");
        System.out.println("4. Finalizar.");
        System.out.print("\nSelecciona una opción: ");
    }

    public static int mostrarSaldo(int saldoInicial) {
        System.out.println("Saldo inicial: " + saldoInicial + "$");
        return saldoInicial;
    }

    public static int retirarDinero(int saldoInicial, int saldoRetirado) {
        System.out.println("___RETIRANDO___");
        if ((saldoRetirado > saldoInicial) || (saldoRetirado <= 0)) {
            System.out.println("Error! No se puede retirar.");
            return saldoInicial;
        } else {
            System.out.println("Saldo retirado correctamente.");
            saldoInicial -= saldoRetirado;
            return saldoInicial;
        }
    }

    public static int depositarDinero(int saldoInicial, int saldoDepositado) {
        System.out.println("___DEPOSITANDO___");
        if (saldoDepositado <= 0) {
            System.out.println("Error! No se puede depositar.");
            return saldoInicial;
        } else {
            System.out.println("Saldo depositado correctamente.");
            saldoInicial += saldoDepositado;
            return saldoInicial;
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int opcion, saldoInicial, saldoRetirado, saldoDepositado;
            saldoInicial = (int)(1000 * Math.random() + 100);

            do {
                menu();
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1: // Mostrar saldo
                        mostrarSaldo(saldoInicial);
                        break;
                    case 2:// Retirar dinero
                        System.out.print("Cuanto desea retirar: ");
                        saldoRetirado = scanner.nextInt();
                        saldoInicial = retirarDinero(saldoInicial, saldoRetirado);
                        break;
                    case 3: // Depositar Dinero
                        System.out.print("Cuanto desea depositar: ");
                        saldoDepositado = scanner.nextInt();
                        saldoInicial = depositarDinero(saldoInicial, saldoDepositado);
                        break;
                    case 4: // Finalizar
                        System.out.println("Finalizando...");
                        opcion = 4;
                        break;
                    default: // Mostrar saldo por defecto
                        mostrarSaldo(saldoInicial);
                        break;
                }
            } while (opcion != 4);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
