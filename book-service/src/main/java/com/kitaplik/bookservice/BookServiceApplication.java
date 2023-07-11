package com.kitaplik.bookservice;

import com.kitaplik.bookservice.model.Book;
import com.kitaplik.bookservice.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaServer
public class BookServiceApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookServiceApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book( "Dünyanın gözü", 2000, "Robert Jordan", "Press Yaınlar", "313");
		Book book2 = new Book( "Yüzüklerin Efendisi", 1960, "J.R.R Tolkiner", "Metis Yaınlar", "314");
		Book book3 = new Book( "Harry Potter ve felsefe taşı", 1997, "J. K . Rowling", "YK Yaınlar", "315");

		List<Book> bookList = bookRepository.saveAll(Arrays.asList(book1, book2, book3));
		System.out.println(bookList);
	}
}
