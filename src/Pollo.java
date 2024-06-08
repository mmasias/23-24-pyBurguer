package src;
public class Pollo extends Carne {
    public Pollo(String coccion) {
        super("Pollo", coccion);
    }

    @Override
    public void mostrar() {
        System.out.println(":::::::::::: (" + super.ver() + ")");
    }
}