package co.alejo.bookstore.persistence.h2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.alejo.bookstore.domain.Book;

public interface H2BookRepository extends CrudRepository<Book, Integer> {
	public List<Book> findByAuthor(String author);
}
