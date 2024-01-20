package com.book.bookservice.DTO;

import com.book.bookservice.model.Categorie;
import com.book.bookservice.model.EtatLivre;
import com.book.bookservice.model.GenreLivre;
import com.book.bookservice.model.Langue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class BookRequestDTO {
    private String libelle;
    private String auteur;
    private String editeur;
    private Langue langue;
    private Categorie categorie;
    private GenreLivre genre;
    private String description;
    private EtatLivre etat;
}
