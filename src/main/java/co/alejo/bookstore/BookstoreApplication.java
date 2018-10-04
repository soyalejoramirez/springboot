package co.alejo.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"co.alejo.bookstore.persistence.h2"})
@EntityScan(basePackages = {"co.alejo.bookstore.domain"})
@ComponentScan(basePackages = {"co.alejo.bookstore.web", "co.alejo.bookstore.domain.service", "co.alejo.bookstore.persistence"})
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
