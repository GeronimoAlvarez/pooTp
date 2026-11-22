package ejercicio2;

public class MedioPago {

    private String titular;


    //Constructor
    public MedioPago(String titular) {
        this.titular = titular;

    }

    //Metodos
    public void procesarPago(double monto) {
        System.out.println("Procesando pago por $[monto]");
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
