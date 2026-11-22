package ejercicio2;

public class BilleteraVirtual extends MedioPago {

    private String nombreAplicacion;


    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }


    public String getTitular() {
        return super.getTitular();
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("pago procesado la informacion es: " + "dueño: " + getTitular() + " billetera: " + nombreAplicacion + " el pago es de: " + monto);
        }
        else {
            System.out.println("el monto debe ser mayor a 0");
        }
    }
}


