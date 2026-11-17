package ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear primer objeto
        Persona p1 = new Persona();
        p1.nombre = "Carlos";
        p1.edad = 25;

        // Crear segundo objeto
        Persona p2 = new Persona();
        p2.nombre = "Lucía";
        p2.edad = 30;

        // Mostrar por consola
        System.out.println("Persona 1 - Nombre: " + p1.nombre + ", Edad: " + p1.edad);
        System.out.println("Persona 2 - Nombre: " + p2.nombre + ", Edad: " + p2.edad);
    }
}