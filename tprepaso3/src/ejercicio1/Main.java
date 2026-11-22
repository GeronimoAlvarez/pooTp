package ejercicio1;

public class Main {
    public static void main(String[] args){

        MaterialDigital libro = new LibroDigital("Luna de pluton");
        MaterialDigital audioLibro = new Audiolibro("Podcast jordi wild");

        libro.mostrarDescripcion();
        audioLibro.mostrarDescripcion();
    }
}
