package com.example.bookcatalogservice.controller;

import com.example.bookcatalogservice.model.Book;
import com.example.bookcatalogservice.service.BookService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return service.create(book);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return service.findById(id);
    }
}
