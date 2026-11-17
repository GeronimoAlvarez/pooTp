package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        libro1.mostrarLibro();
        libro2.mostrarLibro();
    }
}