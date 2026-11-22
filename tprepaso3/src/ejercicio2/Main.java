package ejercicio2;

public class Main {
    public static void main(String[] args){

        MedioPago billeraVirtual = new BilleteraVirtual("geronimo", "Mercado Pago");
        MedioPago tarjeta = new Tarjeta("vicente", 1234);

        billeraVirtual.procesarPago(10000);
        tarjeta.procesarPago(10000);

        billeraVirtual.procesarPago(-10000);
    }
}
