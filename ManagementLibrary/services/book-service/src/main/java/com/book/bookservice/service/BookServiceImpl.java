package com.book.bookservice.service;

import com.book.bookservice.DTO.BookRequestDTO;
import com.book.bookservice.DTO.BookResponseDTO;
import com.book.bookservice.mapper.BookMapper;
import com.book.bookservice.model.Book;
import com.book.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class BookServiceImpl implements  BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    public BookResponseDTO addBook(BookRequestDTO bookRequestDTO) {
        // mapping between BookRequestDTO to Book
        Book book = Book.builder()
                        .reference(UUID.randomUUID().toString())
                                .libelle(bookRequestDTO.getLibelle())
                .dateAjout(new Date())
                .auteur(bookRequestDTO.getAuteur())
                .editeur(bookRequestDTO.getEditeur())
                .langue(bookRequestDTO.getLangue())
                .categorie(bookRequestDTO.getCategorie())
                .genre(bookRequestDTO.getGenre())
                .description(bookRequestDTO.getDescription())
                .etat(bookRequestDTO.getEtat())
                .nbrExemplaire(0)
                .build();

        // verifier les champs d'entrées manuelles et obligatoires (code métier)
        if (
                book.getLibelle() == null
                    || book.getLangue() == null
                    || book.getCategorie() == null
                    || book.getGenre() == null
                    || book.getEtat() == null
        ) return null;

        Book savedBook = bookRepository.save(book);

        return bookMapper.fromBook(savedBook);
    }

    @Override
    public BookResponseDTO updateBook(BookRequestDTO bookRequestDTO) {
        return null;
    }
}
