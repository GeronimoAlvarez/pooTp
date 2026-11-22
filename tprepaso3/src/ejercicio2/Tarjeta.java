package ejercicio2;

public class Tarjeta extends MedioPago {
    private int ultimosCuatroDigitos;

    public Tarjeta(String titular, int ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }


    public String getTitular() {
        return super.getTitular();
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("pago procesado la informacion es: " + "dueño: " + getTitular() + " tarjeta: " + ultimosCuatroDigitos + " el pago es de: " + monto);

        }
        else{
            System.out.println("el monto debe ser mayor a 0");
        }
    }

}
