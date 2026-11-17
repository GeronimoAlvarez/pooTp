package ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto
        Rectangulo triangulo = new Rectangulo();

        // Asignamos valores con set
        triangulo.setBase(10.0);
        triangulo.setAltura(5.0);

        // Mostramos el resultado
        System.out.println("El área es: " + triangulo.calcularArea());
    }
}