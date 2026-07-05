package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Constructor Injection
    public BookService(BookRepository repository) {
        this.repository = repository;
        System.out.println("Constructor Injection Performed");
    }

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
        System.out.println("Setter Injection Performed");
    }

    public void displayService() {
        System.out.println("BookService Bean Created");
        repository.displayRepository();
    }
}
