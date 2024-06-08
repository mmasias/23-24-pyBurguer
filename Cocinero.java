public class Cocinero {

    public void prepararHamburguesa() {
        
        Pan panSuperior = new Brioche();
        Pan panInferior = new Brioche();
        Carne res = new Res();
        Hamburguesa hamburguesa = new Hamburguesa(panSuperior, panInferior, res, 4);

        Extra quesoCheddar = new QuesoCheddar();
        Extra ketchup = new Ketchup();
        Extra mayonesa = new Mayonesa();
        Extra huevo = new Huevo();

        hamburguesa.agregarExtra(quesoCheddar);
        hamburguesa.agregarExtra(ketchup);
        hamburguesa.agregarExtra(mayonesa);
        hamburguesa.agregarExtra(huevo);

        hamburguesa.ver();
    }

    public static void main(String[] args) {
        Cocinero bobEsponja = new Cocinero();
        bobEsponja.prepararHamburguesa();
    }
}
