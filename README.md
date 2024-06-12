# Restaurante

En un restaurante de comida rápida se preparan y sirven hamburguesas. Cada hamburguesa se compone de distintos elementos: diferentes tipos de pan, carnes cocinadas de diversas formas, quesos, salsas y otros ingredientes adicionales.

Cuando el cocinero recibe la orden de preparar una hamburguesa, selecciona los ingredientes adecuados: el pan, el tipo de carne y su cocción y los extras que la acompañarán. El actual cocinero contratado solo sabe preparar hamburguesas con cuatro extras (aunque una hamburguesa puede tener más, dependiendo de la pericia del cocinero).

Una vez preparada, entrega la hamburguesa al camarero, que es el encargado de servirla al cliente. En el proceso de entrega, describe los componentes de la hamburguesa en voz alta para que el cliente sepa exactamente lo que está recibiendo, y luego de esto, muestra la hamburguesa.

|Ingrediente|||Representación|
|-|-|-|-|
|**Pan**|Brioche||`##############`
||Integral||`\|\|\|\|\|\|\|\|\|\|\|\|\|\|` 
|**Carne**|*Admite cocción*||*Poco hecho, muy hecho, medio hecho*
||Res||`::::::::::::`
||Pollo||`;;;;;;;;;;;;`
|**Extras**|Queso Cheddar||`============`
||Queso Azul||`-.-.-.-.-.-.`
||Huevo||`~-~-(  )~-~-`
||*Admiten cantidad:*||*Mucho, poco*
||Salsa Mayonesa||`~=~~=~~=~~=~`
||Salsa Ketchup||`ooOooOooOooO`

```

> java Restaurante

Sale una Brioche, Res (poco hecha), Cheddar, poco de Ketchup, mucho de Mayonesa, Huevo frito!!!

##############
 ::::::::::::
 ============
 ooOooOooOooO
 ~=~~=~~=~~=~
 ----(  )----
##############

```

## 2DO - PRG2

Diseñe y programe un sistema que modele todo este proceso, considerando las responsabilidades del cocinero y del camarero, así como las distintas características, relaciones y comportamientos de los ingredientes involucrados en la preparación de las hamburguesas.

### Legacy

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

## 2DO - EDA2

Adicionalmente, el restaurante ha implementado un nuevo sistema de control de calidad para garantizar que las hamburguesas entregadas a los clientes sean **exactamente** las que se prepararon originalmente. Por lo tanto, se requiere que la solución incluya un mecanismo de validación para las hamburguesas creadas.

Específicamente, después de que un cocinero prepara una hamburguesa y antes de entregarla al empleado encargado de servir, se debe generar un código de validación único para esa hamburguesa. Este código de validación debe ser calculado en función de los ingredientes y características de la hamburguesa, de tal manera que cualquier cambio en los componentes de la hamburguesa resultaría en un código de validación diferente.

Cuando el empleado recibe la hamburguesa del cocinero, debe verificar que el código de validación coincida con el generado inicialmente. Si el código de validación no coincide, significa que la hamburguesa ha sido alterada y no debe ser servida al cliente.

Implemente el mecanismo pertinente para generar el código de validación que garantice la integridad y unicidad del código generado. Deje un caso de uso que permita validar dicho mecanismo.
