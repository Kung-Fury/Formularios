Vamos a realizar un programa MVC con Spring similar al visto en los casos prácticos. Tenemos un modelo de Alumno que tiene las siguientes propiedades:

Nombre (String, requerido, longitud mínima 3)

DNI (String, validación de DNI)

email (String, validación de mail pista: regexp)

Becado (String S-Sí, N-No)

Asignaturas (Array con las posibilidades: PHP, JAVA, JS, .NET)

Tenemos que tener una página de inicio con un enlace al formulario de alta que estará dentro de la ruta /alumno/form

Cuando el usuario introduzca los datos nos enviará a una página donde se muestran los datos si todo ha ido bien, si hay errores permanece en el formulario y los muestra.
