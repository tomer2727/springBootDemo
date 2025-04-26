package com.example.bookcatalogservice.service;

import com.example.bookcatalogservice.model.Book;
import com.example.bookcatalogservice.repository.BookRepository;
//import org.hibernate.engine.internal.Nullability;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo){
        this.repo =repo;
    }

    //TODO implement
    public Book create(Book book){
        return repo.save(book);
    }

    //TODO implement
    public Book findById(Long id){
        return repo.findById(id).orElseThrow(NoSuchElementException::new);
    }

}
