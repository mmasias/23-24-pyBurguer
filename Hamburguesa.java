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

    public void ver() {
        System.out.println(panes[0].ver());
        System.out.println(carne.ver());
        for (int i = 0; i < extrasAgregados; i++) {
            System.out.println(extras[i].ver());
        }
        System.out.println(panes[1].ver());
    }
}
