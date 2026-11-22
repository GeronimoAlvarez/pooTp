package ejercicio1;

public class MaterialDigital {

    //Atributos

    private String titulo;


    //Constructor
    public MaterialDigital(String titulo) {
        this.titulo = titulo;

    }

    //Metodos
    public void mostrarDescripcion() {
        System.out.println("Material disponible en la biblioteca digital");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

