package com.book.bookservice.service;

import com.book.bookservice.DTO.BookRequestDTO;
import com.book.bookservice.DTO.BookResponseDTO;

public interface BookService {
    BookResponseDTO addBook(BookRequestDTO bookRequestDTO);
    BookResponseDTO updateBook(BookRequestDTO bookRequestDTO);
}
