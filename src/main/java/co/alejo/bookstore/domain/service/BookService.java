package co.alejo.bookstore.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.alejo.bookstore.domain.Book;
import co.alejo.bookstore.domain.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAll() {
		return bookRepository.findAll();
	}
	
	public List<Book> getAllByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}
	
	public Book newBook(Book b) {
		return bookRepository.save(b);
	}
}
