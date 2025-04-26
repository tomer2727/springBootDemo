package com.example.bookcatalogservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor    // for Jackson deserialisation
@AllArgsConstructor   // convenient full constructor
public class BookDTO {
    private Long id;
    private String title;
    private String author;
}

