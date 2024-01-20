package com.loan.loanservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String reference;

    @Column(nullable = false)
    private Long adherent;

    @Column(nullable = false)
    private Long book;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRecuperation;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRetour;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EtatEmprunt etat;

    public Emprunt(Long id, String reference, Long adherent, Long book, Date dateCreation, EtatEmprunt etat) {
        this.id = id;
        this.reference = reference;
        this.adherent = adherent;
        this.book = book;
        this.dateCreation = dateCreation;
        this.etat = etat;
    }
}
