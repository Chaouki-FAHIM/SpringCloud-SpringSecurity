package com.book.bookservice.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String reference;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAjout;

    @Column(nullable = false)
    private String libelle;

    private String auteur;

    private String editeur;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Langue langue;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GenreLivre genre;

    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EtatLivre etat;

    @Column(nullable = false)
    private int nbrExemplaire;

    public Book(Long id, String reference, Date dateAjout, String libelle, Langue langue, Categorie categorie, GenreLivre genre, EtatLivre etat, int nbrExemplaire) {
        this.id = id;
        this.reference = reference;
        this.dateAjout = dateAjout;
        this.libelle = libelle;
        this.langue = langue;
        this.categorie = categorie;
        this.genre = genre;
        this.etat = etat;
        this.nbrExemplaire = nbrExemplaire;
    }
}
