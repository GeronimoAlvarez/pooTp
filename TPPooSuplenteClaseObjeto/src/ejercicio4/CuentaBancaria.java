package ejercicio4;

public class CuentaBancaria {
    private double saldo;

    // Método set para modificar el saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }

    // Método get para devolver el valor actual
    public double getSaldo() {
        return saldo;
    }
}