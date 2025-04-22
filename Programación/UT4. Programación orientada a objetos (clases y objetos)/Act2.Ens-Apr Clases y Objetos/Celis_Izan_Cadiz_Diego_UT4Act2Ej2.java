class CuentaBancaria {
    // Propiedades
    double saldo;
    int pin;
    int numCuenta;

    // Constructor
    CuentaBancaria(double saldo, int pin, int numCuenta) {
        this.saldo = saldo;
        this.pin = pin;
        this.numCuenta = numCuenta;
    }

    CuentaBancaria(double saldo, int numCuenta) {
        this.saldo = saldo;
        this.pin = 0;
        this.numCuenta = numCuenta;
    }

    // Métodos
    void consultarSaldo() {
        System.out.println("El saldo es: " + this.saldo + "$");
    }
}


public class Celis_Izan_Cadiz_Diego_UT4Act2Ej2 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(2000, 1234, 3432322);

        cuenta1.consultarSaldo();
    }
}
