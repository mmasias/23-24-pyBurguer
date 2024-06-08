package src;
public class QuesoAzul extends Queso {
    public QuesoAzul() {
        super("Queso Azul");
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "-·".repeat(6));
    }
}
