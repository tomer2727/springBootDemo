package com.example.bookcatalogservice.service;
import com.example.bookcatalogservice.model.Book;
import com.example.bookcatalogservice.dto.BookDTO;
import com.example.bookcatalogservice.dto.BookCreateDTO;
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
    public BookDTO create(BookCreateDTO dto) {
        Book saved = repo.save(fromCreateDto(dto));
        return toDto(saved);
    }
    //TODO implement
    public BookDTO findById(Long id) {
        return toDto(repo.findById(id).orElseThrow());
    }
    private BookDTO toDto(Book entity) {
        return new BookDTO(entity.getId(),
                entity.getTitle(),
                entity.getAuthor());
    }

    private Book fromCreateDto(BookCreateDTO dto) {
        Book b = new Book();
        b.setTitle(dto.getTitle());
        b.setAuthor(dto.getAuthor());
        // isbn stays null – maybe you populate it later, or elsewhere
        return b;
    }
}
