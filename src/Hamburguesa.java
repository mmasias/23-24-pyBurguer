package src;

class Hamburguesa {
    private ListaIngredientes ingredientes;
    
    public Hamburguesa() {
        this.ingredientes = new ListaIngredientes();
    }
    
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.agregar(ingrediente);
    }
    
    public void agregarIngrediente(Ingrediente ingrediente, int posicion) {
        ingredientes.agregar(ingrediente, posicion);
    }
    
    public void quitarIngrediente(int posicion) {
        ingredientes.quitar(posicion);
    }

    public Ingrediente verIngrediente(int posicion) {
        return ingredientes.obtener(posicion);
    }    

    public void reorganizarIngredientes(int de, int a) {
        ingredientes.reorganizar(de, a);
    }
    
    public void mostrar() {
        for (int i = 0; i < ingredientes.tamaño(); i++) {
            ingredientes.obtener(i).mostrar();
        }
    }
    
    public String describir() {
        String descripcion = "Hamburguesa de ";
        for (int i = 0; i < ingredientes.tamaño(); i++) {
            descripcion = descripcion + ", " + ingredientes.obtener(i).describir();
        }
        return descripcion;
    }
}
