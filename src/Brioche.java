package src;
public class Brioche extends Pan {
    public Brioche() {
        super("Brioche");
    }

    @Override
    public void mostrar() {
        System.out.println("#".repeat(14));
    }
}