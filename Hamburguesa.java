class Hamburguesa{
    
    private Pan[] panes;
    private Carne carne;
    private Salsa[] salsas;
    private int salsasAgregadas;
    private Extra[] extras;
    private int extrasAgregados;


    public Hamburguesa(Pan pan, int numeroSalsas, int numeroExtras){
        panes = new Pan[2];
        panes[0] = pan;
        salsas = new Salsa[numeroSalsas];
        salsasAgregadas = 0;
        extras = new Extra[numeroExtras];
        extrasAgregados = 0;
    }


    public void ponerExtra(Extra extra) {
        extras[extrasAgregados]=extra;
        extrasAgregados++;
    }


    public void ponerCarne(Carne carne) {
        this.carne = carne;
    }


    public void ponerSalsa(Salsa salsa) {
        salsas[salsasAgregadas] = salsa;
        salsasAgregadas++;
    }


    public void ponerPan(Pan pan) {
        panes[1] = pan;
    }


    public void ver() {
        System.out.println(panes[1].ver());
        
        for (Extra extra : extras) {
            extra.ver();
        }

        System.out.println(panes[0].ver());
    }
}