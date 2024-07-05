# Restaurante

En un restaurante de comida rápida se preparan y sirven hamburguesas. Cada hamburguesa se compone de distintos elementos: diferentes tipos de pan, carnes cocinadas de diversas formas, quesos, salsas y otros ingredientes adicionales.

Cuando el cocinero recibe la orden de preparar una hamburguesa, selecciona los ingredientes adecuados: el pan, el tipo de carne y su cocción y los extras que la acompañarán. El actual cocinero contratado solo sabe preparar hamburguesas con cuatro extras (aunque una hamburguesa puede tener más, dependiendo de la pericia del cocinero).

Una vez preparada, entrega la hamburguesa al camarero, que es el encargado de servirla al cliente. En el proceso de entrega, describe los componentes de la hamburguesa en voz alta para que el cliente sepa exactamente lo que está recibiendo, y luego de esto, muestra la hamburguesa.

<div align=center>

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

</div>

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

|PRG1|PRG2|EDA1|EDA2|
|-|-|-|-|
[Test](testPRG1.md)|[Test](testPRG2.md)|[Test](testEDA1.md)|[Test](testEDA2.md)|



