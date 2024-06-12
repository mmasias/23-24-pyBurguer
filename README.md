# Una hamburguesa

<div align=center>

||
|:-:|
![](/images/theBurguer.webp)
![](/images/modelosUML/modelosUML/modelo2.svg)
![](/images/modelosUML/modelosUML/modelo3.svg)

</div>

En el restaurante de comida rápida 'Crustáceo Crujiente' se preparan y sirven hamburguesas. Cada hamburguesa se compone de distintos elementos, como diferentes tipos de pan, carnes cocinadas de diversas formas, quesos, salsas y otros ingredientes adicionales.

Cuando Bob Esponja recibe la orden de preparar una hamburguesa, selecciona los ingredientes adecuados: el pan, el tipo de carne y su cocción y los extras que la acompañarán. Una vez preparada, entrega la hamburguesa a Calamardo, que es el encargado de servirla al cliente. En el proceso de entrega, describe los componentes de la hamburguesa en voz alta para que el cliente sepa exactamente lo que está recibiendo. Luego de esto, muestra la hamburguesa.

Diseñe y programe un sistema de software que modele todo este proceso en el 'Crustáceo Crujiente', considerando las responsabilidades de Bob Esponja como cocinero y de Calamardo como empleado, así como las distintas características, relaciones y comportamientos de los ingredientes involucrados en la preparación de las hamburguesas.

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
Sale una Brioche, Res (poco hecha), Cheddar, poco de Ketchup, mucho de Mayonesa, Huevo frito

##############
 ::::::::::::
 ============
 ooOooOooOooO
 ~=~~=~~=~~=~
 ----(  )----
##############
```
