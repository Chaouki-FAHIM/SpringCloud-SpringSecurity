package com.book.bookservice.mapper;

import com.book.bookservice.DTO.BookResponseDTO;
import com.book.bookservice.model.Book;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookResponseDTO fromBook(Book book) {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        BeanUtils.copyProperties(book,bookResponseDTO);
        return bookResponseDTO;
    }
}
