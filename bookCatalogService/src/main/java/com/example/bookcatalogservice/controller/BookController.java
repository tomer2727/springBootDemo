package com.example.bookcatalogservice.controller;

import com.example.bookcatalogservice.dto.BookDTO;
import com.example.bookcatalogservice.dto.BookCreateDTO;
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
    public BookDTO create(@RequestBody BookCreateDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public BookDTO getById(@PathVariable Long id) {
        return service.findById(id);
    }
}
