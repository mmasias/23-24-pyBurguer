package src;
public class Ketchup extends Salsa {
    public Ketchup(String cantidad) {
        super("Ketchup", cantidad);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "ooO".repeat(4));
    }
}