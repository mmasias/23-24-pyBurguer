package src;
public class Mayonesa extends Salsa {
    public Mayonesa(String cantidad) {
        super("Mayonesa", cantidad);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "~=~".repeat(4));
    }
}