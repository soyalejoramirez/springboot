package co.alejo.bookstore.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.alejo.bookstore.domain.Book;
import co.alejo.bookstore.domain.repository.BookRepository;
import co.alejo.bookstore.persistence.h2.H2BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository {
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private H2BookRepository h2BookRepo;

	@Override
	public List<Book> findAll() {
//		return jdbcTemplate.query("SELECT * FROM BOOKS", new BeanPropertyRowMapper<Book>(Book.class));
		return (List<Book>) h2BookRepo.findAll();
	}
	
	@Override
	public List<Book> findByAuthor(String author) {
		return h2BookRepo.findAllByAuthor(author);
	}

	@Override
	public Book save(Book b) {
		return h2BookRepo.save(b);
	}
}
