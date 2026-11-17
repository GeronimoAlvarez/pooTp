package ejercicio2;

public class Auto extends Vehiculo {
    private int cant_Puertas;

    public Auto(String marca, String modelo, int cant_Puertas) {
        super(marca, modelo);
        setCant_Puertas(cant_Puertas);
    }

    public int getCant_Puertas() {
        return cant_Puertas;
    }

    public void setCant_Puertas(int cant_Puertas) {
        if (cant_Puertas > 0) {
            this.cant_Puertas = cant_Puertas;
        } else {
            System.out.println("Error: La cantidad de puertas debe ser mayor a 0.");
        }
    }

    public void mostrarInfoAuto() {
        System.out.println("--- Información del Auto ---");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cantidad de puertas: " + getCant_Puertas());
    }
}