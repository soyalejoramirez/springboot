package co.alejo.bookstore.domain.repository;

import java.util.List;

import co.alejo.bookstore.domain.Book;

public interface BookRepository {
	public List<Book> findAll();
	public List<Book> findByAuthor(String author);
	public Book save(Book b);
}
