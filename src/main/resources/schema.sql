CREATE TABLE IF NOT EXISTS BOOKS
(
   isbn integer not null AUTO_INCREMENT,
   name varchar(255) not null,
   author varchar(255) not null,
   publisher varchar(50),
   genre varchar(50),
   
   primary key(isbn)
);