package com.book.bookservice.repository;

import com.book.bookservice.model.Book;
import com.book.bookservice.model.Categorie;
import com.book.bookservice.model.GenreLivre;
import com.book.bookservice.model.Langue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book,Long> {

    @RestResource(path = "/byCategorie")
    List<Book> findByCategorie(@Param("t") Categorie categorie);
    @RestResource(path = "/byGenre")
    List<Book> findByGenre(@Param("g")GenreLivre genre);
    @RestResource(path = "/byLangue")
    List<Book> findByLangue(@Param("l") Langue langue);

}
