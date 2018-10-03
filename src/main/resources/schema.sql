CREATE TABLE IF NOT EXISTS LIBROS
(
   isbn integer not null AUTO_INCREMENT,
   nombre varchar(255) not null,
   autor varchar(255) not null,
   editorial varchar(50),
   genero varchar(50),
   
   primary key(isbn)
);