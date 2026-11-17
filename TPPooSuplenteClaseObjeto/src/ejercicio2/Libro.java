package ejercicio2;

public class Libro {
    String titulo;
    String autor;
    int año;

    // Constructor
    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public void mostrarLibro() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Año: " + año);
    }
}