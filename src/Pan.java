package src;
public abstract class Pan {

    private String nombre;

    public Pan(String nombre) {
        this.nombre = nombre;
    }

    public String ver() {
        return nombre;
    }

    public abstract void mostrar();

    public String describir() {
        return nombre;
    }
}