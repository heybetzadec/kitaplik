package com.kitaplik.bookservice.service;

import com.kitaplik.bookservice.dto.BookDto;
import com.kitaplik.bookservice.repository.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<BookDto> getAllBooks() {
        return repository.findAll()
                .stream()
                .map(BookDto::convert)
                .collect(Collectors.toList());
    }

}
