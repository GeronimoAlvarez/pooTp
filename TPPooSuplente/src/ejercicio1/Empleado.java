package ejercicio1;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }

    public void mostrarDatos() {
        System.out.println("--- Datos del Empleado ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Salario: $" + getSalario());
    }
}