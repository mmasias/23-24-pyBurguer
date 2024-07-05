package src;

class ListaIngredientes {
    private Nodo cabeza;
    private int tamaño;
    
    public ListaIngredientes() {
        this.cabeza = null;
        this.tamaño = 0;
    }
    
    public void agregar(Ingrediente ingrediente) {
        agregar(ingrediente,0);
    }
    
    public void agregar(Ingrediente ingrediente, int posicion) {
        Nodo nuevoNodo = new Nodo(ingrediente);
        if (posicion == 0) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }
    
    public void quitar(int posicion) {
        if (posicion == 0) {
            cabeza = cabeza.siguiente;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
        }
        tamaño--;
    }
    
    public void reorganizar(int de, int a) {
        Ingrediente ingrediente = obtener(de);
        quitar(de);
        agregar(ingrediente, a);
    }
    
    public Ingrediente obtener(int posicion) {
        Nodo actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.ingrediente;
    }
    
    public int tamaño() {
        return tamaño;
    }
}
