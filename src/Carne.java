package src;
public abstract class Carne {

    private String nombre;
    private String coccion;

    public Carne(String nombre, String coccion) {
        this.nombre = nombre;
        this.coccion = coccion;
    }

    public String ver() {
        return nombre + " (" + coccion + ")";
    }

    public abstract void mostrar();
}