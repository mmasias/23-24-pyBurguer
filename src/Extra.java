package src;
public abstract class Extra {

    private String nombre;

    public Extra(String nombre) {
        this.nombre = nombre;
    }

    public String ver() {
        return nombre;
    }

    public abstract void mostrar();
}