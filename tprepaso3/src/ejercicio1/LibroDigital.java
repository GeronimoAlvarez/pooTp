package ejercicio1;

public class LibroDigital extends MaterialDigital {

    public LibroDigital(String titulo) {
        super(titulo);
    }

    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Se puede leer en pantalla" + " " + getTitulo());
    }
}
