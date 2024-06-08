package src;

public class Hamburguesa {

    private Pan[] panes;
    private Carne carne;
    private Extra[] extras;
    private int extrasAgregados;

    public Hamburguesa(Pan panSuperior, Pan panInferior, Carne carne, int numeroExtras) {
        this.panes = new Pan[]{panSuperior, panInferior};
        this.carne = carne;
        this.extras = new Extra[numeroExtras];
        this.extrasAgregados = 0;
    }

    public void agregarExtra(Extra extra) {
        if (extrasAgregados < extras.length) {
            extras[extrasAgregados] = extra;
            extrasAgregados++;
        } else {
            System.out.println("No se pueden agregar más extras.");
        }
    }

    public void mostrar() {
        panes[0].mostrar();
        carne.mostrar();
        for (int i = 0; i < extrasAgregados; i++) {
            extras[i].mostrar();
        }
        panes[1].mostrar();
    }

    public void describir() {    
        System.out.print (panes[0].describir() + ", " + carne.describir());
        for (int i = 0; i < extrasAgregados; i++) {
            System.out.print(", " + extras[i].describir());
        }
        System.out.println();
    }
}
