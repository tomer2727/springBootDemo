package com.example.bookcatalogservice.repository;

import com.example.bookcatalogservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {
}