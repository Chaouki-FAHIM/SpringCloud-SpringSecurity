package com.book.bookservice.controler;

import com.book.bookservice.DTO.BookRequestDTO;
import com.book.bookservice.DTO.BookResponseDTO;
import com.book.bookservice.mapper.BookMapper;
import com.book.bookservice.model.Book;
import com.book.bookservice.repository.BookRepository;
import com.book.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestControler {
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookService bookService;

    public BookRestControler(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("first","second"));
    }

    @GetMapping("/books/{id}")
    public Book getBook (@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Le livre %s est introuvable !!",id)));
    }

    @PutMapping("/books/{id}")
    public Book updateBook (@PathVariable Long id, @RequestBody Book newBook) {
        Book oldBook= bookRepository.findById(id).orElseThrow();

        // modifier les champs qui sont nulls
        if(newBook.getAuteur()!=null) oldBook.setAuteur(newBook.getAuteur());
        if(newBook.getEditeur()!=null) oldBook.setEditeur(newBook.getEditeur());
        if(newBook.getDescription()!=null) oldBook.setDescription(newBook.getDescription());

        // modifier les champs par les nouvelles valeurs
        oldBook.setReference(newBook.getReference());
        oldBook.setLibelle(newBook.getLibelle());
        oldBook.setLangue(newBook.getLangue());
        oldBook.setCategorie(newBook.getCategorie());
        oldBook.setGenre(newBook.getGenre());
        oldBook.setEtat(newBook.getEtat());

        return bookRepository.save(oldBook);
    }

    @PostMapping("/books")
    public BookResponseDTO saveBook (@RequestBody BookRequestDTO bookRequestDTO) {
        return bookService.addBook(bookRequestDTO);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook (@PathVariable Long id) {
        Book book= bookRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Le livre de %s est introuvable !!",id)));
        if ( book != null ) bookRepository.delete(book);
    }

}
