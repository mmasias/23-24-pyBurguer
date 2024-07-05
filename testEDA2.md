# 2DO - EDA2

- Parte 1 - _in plan english_
- Parte 2 - Dev...

## Caso

### Validación de hamburguesas

Adicionalmente, el restaurante ha implementado un nuevo sistema de control de calidad para garantizar que las hamburguesas entregadas a los clientes sean **exactamente** las que se prepararon originalmente. Por lo tanto, se requiere que la solución incluya un mecanismo de validación para las hamburguesas creadas.

Específicamente, después de que un cocinero prepara una hamburguesa y antes de entregarla al empleado encargado de servir, se debe generar un código de validación único para esa hamburguesa. Este código de validación debe ser calculado en función de los ingredientes y características de la hamburguesa, de tal manera que cualquier cambio en los componentes de la hamburguesa resultaría en un código de validación diferente.

Cuando el empleado recibe la hamburguesa del cocinero, debe verificar que el código de validación coincida con el generado inicialmente. Si el código de validación no coincide, significa que la hamburguesa ha sido alterada y no debe ser servida al cliente.

Implemente el mecanismo pertinente para generar el código de validación que garantice la integridad y unicidad del código generado. Deje un caso de uso que permita validar dicho mecanismo.

### Extensión de línea de negocio

Además de las populares hamburguesas, el restaurante ha decidido ampliar su menú e incluir kebabs. Un kebab es una pila de diferentes carnes que se van cortando y sirviendo a los clientes.

En previsión de esta extensión, hay que ajustar la solución para permitir la preparación y validación de kebabs. Al igual que con las hamburguesas, se requiere implementar un mecanismo de validación para garantizar que los kebabs entregados a los clientes sean **exactamente** los que se prepararon originalmente.

Antes de servir el kebab al cliente, el empleado debe verificar que es el entregado por el cocinero.

Proponga el modelado y el mecanismo pertinente para garantizar la integridad y unicidad del kebab preparado. 
