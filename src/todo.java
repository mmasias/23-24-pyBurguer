package src;

class Azul extends Queso {
    public Azul() {
        super("Queso Azul");
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "-·".repeat(6));
    }
}

class Brioche extends Pan {
    public Brioche() {
        super("Brioche");
    }

    @Override
    public void mostrar() {
        System.out.println("#".repeat(14));
    }
}

class Camarero extends Empleado {

    public void recibir(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
        tieneHamburguesa = true;
    }

    public void servir() {
        System.out.println("Sale una " + hamburguesa.describir());
        hamburguesa.mostrar();
    }
}

abstract class Carne extends Ingrediente {
    private String coccion;

    public Carne(String nombre, String coccion) {
        this.nombre = nombre;
        this.coccion = coccion;
    }

    public String describir() {
        return nombre + " (" + coccion + ")";
    }

    public abstract void mostrar();    
}
 class Cheddar extends Queso {
    public Cheddar() {
        super("Cheddar");
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "=".repeat(12));
    }
}

class Cocinero extends Empleado {

    public void prepararHamburguesa() {
        Carne laCarne = new Res("poco hecha");
        hamburguesa = new Hamburguesa(new Brioche(), new Brioche(), laCarne, 4);

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

abstract class Extra extends Ingrediente {
    protected Extra(String nombre) {
        this.nombre = nombre;
    }
}

class Hamburguesa {
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

    public String describir() {   
        String descripcion; 
        descripcion = panes[0].describir() + ", " + carne.describir();
        for (int i = 0; i < extrasAgregados; i++) {
            descripcion = descripcion + ", " + extras[i].describir();
        }
        descripcion = descripcion + "\n";
        return descripcion;
    }
}

class Huevo extends Extra {
    public Huevo() {
        super("Huevo frito");
    }

    @Override
    public void mostrar() {
        System.out.println(" ----(  )----");
    }
}

abstract class Ingrediente {
    protected String nombre;

    public String describir() {
        return nombre;
    }

    public abstract void mostrar();  
}
class Integral extends Pan {
    public Integral() {
        super("Integral");
    }

    @Override
    public void mostrar() {
        System.out.println("|".repeat(14));
    }
}
class Ketchup extends Salsa {

    public Ketchup(String cantidad) {
        super("Ketchup", cantidad);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "ooO".repeat(4));
    }
}
public class Mayonesa extends Salsa {
    public Mayonesa(String cantidad) {
        super("Mayonesa", cantidad);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + "~=~".repeat(4));
    }
}
abstract class Pan extends Ingrediente {
    protected Pan(String nombre) {
        this.nombre = nombre;
    }  
}
class Pollo extends Carne {
    public Pollo(String coccion) {
        super("Pollo", coccion);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + ":".repeat(12));
    }
}
abstract class Queso extends Extra {
    protected Queso(String nombre) {
        super(nombre);
    }
}
class Res extends Carne {
    public Res(String coccion) {
        super("Res", coccion);
    }

    @Override
    public void mostrar() {
        System.out.println(" " + ":".repeat(12));
    }
}

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

abstract class Salsa extends Extra {
    private String cantidad;

    protected Salsa(String nombre, String cantidad) {
        super(nombre);
        this.cantidad = cantidad;
    }

    @Override
    public String describir() {
        return cantidad + " de " + super.describir();
    }

    public abstract void mostrar();
}