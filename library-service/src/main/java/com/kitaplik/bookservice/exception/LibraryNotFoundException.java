package com.kitaplik.bookservice.exception;

public class LibraryNotFoundException extends RuntimeException{

    public LibraryNotFoundException(String s) {
        super(s);
    }

}
