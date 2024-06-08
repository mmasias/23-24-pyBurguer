package src;
public class Salsa extends Extra {

    private String cantidad;

    public Salsa(String nombre, String cantidad) {
        super(nombre);
        this.cantidad = cantidad;
    }

    @Override
    public String ver() {
        return super.ver() + " (" + cantidad + ")";
    }

    @Override
    public void mostrar() {
        System.out.println("~~~~~~~~~~~");
    }
}