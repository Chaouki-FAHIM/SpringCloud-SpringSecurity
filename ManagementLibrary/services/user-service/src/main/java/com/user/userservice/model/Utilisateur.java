package com.user.userservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Utilisateur")

public abstract class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "reference", nullable = false)
    protected String reference;

    @Column(name = "nom", nullable = false)
    protected String nom;

    @Column(name = "prenom", nullable = false)
    protected String prenom;

    @Column(name = "email", nullable = false, unique = true)
    protected String email;

    @Column(name = "mot_de_passe")
    protected String motDePasse;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    protected Role role;

    public Utilisateur(String reference, String nom, String prenom, String email, Role role) {
        this.reference = reference;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.role = role;
    }
}
