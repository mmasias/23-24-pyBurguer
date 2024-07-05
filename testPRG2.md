# 2DO - PRG2

Diseñe y programe un sistema que modele todo este proceso, considerando las responsabilidades del cocinero y del camarero, así como las distintas características, relaciones y comportamientos de los ingredientes involucrados en la preparación de las hamburguesas.

## Legacy

¡No parte de cero! Se ha conseguido acceso al siguiente fragmento de código, al cual se agregará el código que presente.

```java
class Restaurante {

    private void atender() {

        Cocinero bobEsponja = new Cocinero();
        Camarero calamardo = new Camarero();
        
        bobEsponja.prepararHamburguesa();
        calamardo.recibir(bobEsponja.entregar());

        calamardo.servir();
    }
    public static void main(String[] args) {
        Restaurante crustaceoCrujiente = new Restaurante();
        crustaceoCrujiente.atender();
    }
}

class Cocinero extends Empleado {

    public void prepararHamburguesa() {
        final int NUMERO_EXTRAS = 4;
        Carne laCarne = new Res("poco hecha");
        hamburguesa = new Hamburguesa(new Brioche(), new Brioche(), laCarne, NUMERO_EXTRAS);

        hamburguesa.agregarExtra(new Cheddar());
        hamburguesa.agregarExtra(new Ketchup("poco"));
        hamburguesa.agregarExtra(new Mayonesa("mucho"));
        hamburguesa.agregarExtra(new Huevo());
        this.tieneHamburguesa = true;
    }

    public Hamburguesa entregar() {
        this.tieneHamburguesa = false;
        return hamburguesa;
    }
}

abstract class Empleado {
    protected Hamburguesa hamburguesa;
    protected boolean tieneHamburguesa;

    public Empleado() {
        this.tieneHamburguesa = false;
    }
}
```