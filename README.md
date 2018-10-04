# Aplicación autocontenida con Spring Boot y H2
Esto una PEQUEÑA aplicación de una tienda de libros construida con Spring Boot sobre una base de datos H2 con fines educativos.

Para hacerla funcionar en tu equipo puedes hacer Fork o descargar y descomprimir el ZIP de este repositorio. Luego en Eclipse (Debes tener [el plugin de Spring Tools](http://marketplace.eclipse.org/content/spring-tools-3-add-aka-spring-tool-suite-3 "Spring Tools") instalado) realizas los siguientes pasos: 

1.  Ir a File / Import.
2.  Buscas la opción 'Existing Maven Projects'.
3.	En el 'Root Directory' seleccionas la carpeta donde dejaste el código.
4.	Seleccionas el pom.xml del proyecto y das clic en Finish.
5. 	Una vez el proyecto finalice su importación das clic derecho sobre el proyecto y vas a Run As / Spring Boot App.
6.	Vas a localhost:8080/api/books/all para ver todos los libros existentes.
7.	¡Crea nuevas funcionalidades!

#### Enlaces de interés
*   [¿Qué es y cómo funciona Spring Boot?](http://spring.io/projects/spring-boot "Spring Boot")
*   [¿Qué es y cómo funciona H2 Database?](https://www.tutorialspoint.com/h2_database/index.htm "H2 Database") 
*   [Crear aplicación con Spring Initializr](https://start.spring.io/ "Spring Initializr") 
*   [Query Methods de Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details "Query Methods") 
*   [Palabras clave soportadas para los Query Methods de Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords "Repository Query keywords")