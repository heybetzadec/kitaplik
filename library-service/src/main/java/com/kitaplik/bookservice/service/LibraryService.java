package com.kitaplik.bookservice.service;

import com.kitaplik.bookservice.dto.LibraryDto;
import com.kitaplik.bookservice.exception.LibraryNotFoundException;
import com.kitaplik.bookservice.model.Library;
import com.kitaplik.bookservice.repository.LibraryRepository;

public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryDto getAllBooksInLibraryById(String id) {
        Library library = libraryRepository.findById(id).orElseThrow(() -> new LibraryNotFoundException("Library could not found"));
        return new LibraryDto(library.getId());
    }

    public LibraryDto createLibrary() {
        Library newLibrary = libraryRepository.save(new Library());
        return new LibraryDto(newLibrary.getId());
    }

}
