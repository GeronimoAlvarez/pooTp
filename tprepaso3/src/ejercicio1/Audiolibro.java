package ejercicio1;

public class Audiolibro extends MaterialDigital{

    public Audiolibro(String titulo) {
        super(titulo);
    }

    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Se puede escuchar" + " " + getTitulo());
    }
}
