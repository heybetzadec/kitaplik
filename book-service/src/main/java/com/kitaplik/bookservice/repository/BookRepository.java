package com.kitaplik.bookservice.repository;

import com.kitaplik.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
