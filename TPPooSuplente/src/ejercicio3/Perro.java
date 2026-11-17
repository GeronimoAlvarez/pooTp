package ejercicio3;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza != null && !raza.trim().isEmpty()) {
            this.raza = raza;
        } else {
            this.raza = "Mestizo";
        }
    }

    public void ladrar() {
        System.out.println("el perro está ladrando");
    }
}