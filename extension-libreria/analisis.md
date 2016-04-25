Analisis del Codigo:

- El codigo es bastante legible. Contiene clases, metodos, y variables con nombres claros.
- La tabulacion es correcta y consistente en todas las clases.
- Muy buena modulacion.
- En algunas ocasiones las sentencias aparecen muy juntas, y no hay espacios entre ellas para
  distinguir de forma inmediata las diferentes cosas que se hacen en las mismas referido a una misma 
  operacion.
- Me sorprendio que se use la clase "BigDecimal" para realizar operaciones matematicas y expresar 
  precios.
- Sorprendentemente no estaba la clase "Libro", con lo cual me veo obligatoriamente a crearla para
  que la Libreria soporte los alquileres diarios, mensuales, y cuatrimestrales de libros.
- Me resulto curioso que se haya creado la clase "DiarioYRevista" (Los dos en una misma clase). Aunque
  esa decision de implementacion estoy seguro que no influira en la extensibilidad del sistema.
- Hay POCOS Tests, los justos y necesarios. Todos funcionan, pero no se han probado una minima 
  combinacion de otros casos particulares.
- En principio y a mi consideracion, se debera modificar la clase "Libreria" para agregar la nueva 
  funcionalidad. Y ademas, crear otras clases (Entre ella la clase "Libro") como apoyo, para que el 
  alquiler de libros sea exitoso.

- EN LINEAS GENERALES: El codigo, la implementacion, y el diseño son aceptables.


Analisis post-programacion:

- Primero y principal, me resulto MUY INCOMODO trabajar con la clase "BigDecimal". Aunque decidi seguir
  usandola para que todo el sistema sea consistente en cuanto a los calculos y expresiones de precios.
- Tuve que cambiar una linea de codigo en el metodo "calcularMontoACobrar()" en la clase "Libreria", ya
  que se contemplaba que un cliente pueda tener solamente una compra por mes, y no muchas. Dado esto, 
  si un cliente tenia mas de una compra en un mes, el metodo devolvia como monto a cobrar el precio de 
  la ultima compra realizada y no de todas juntas.
- Finalmente solo debio tocarse la clase "Libreria". El resto de las clases permanecen iguales.
- Se agregaron 5 clases: Libro, Alquiler, AlquilerDiario, AlquilerMensual, y AlquilerCuatrimestral.

- CONCLUSION: No se dificulto demasiado la extensibilidad del sistema gracias al diseño implementado
              anteriormente. Se debio agregar mas de lo que se debio corregir.


UNTreF: Analisis y Diseño Orientado a Objetos 2016 - Gonzalo Nahuel Di Pierro (Legajo: 26816).
Profesor: Nicolas Paez.