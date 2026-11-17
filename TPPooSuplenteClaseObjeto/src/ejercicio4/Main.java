package ejercicio4;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // Modificamos el saldo usando set
        cuenta.setSaldo(150000.50);

        // Mostramos el saldo usando get
        System.out.println("El saldo actual es: $" + cuenta.getSaldo());
    }
}