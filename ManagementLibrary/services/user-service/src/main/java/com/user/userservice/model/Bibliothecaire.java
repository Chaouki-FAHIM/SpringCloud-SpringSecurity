package com.user.userservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bibliothecaire extends Utilisateur {

    @Column(name = "emplacement")
    private String emplacement;

    public Bibliothecaire(String reference, String nom, String prenom, String email,String emplacement) {
        super(reference, nom, prenom, email,Role.ADMIN);
        this.emplacement = emplacement;
    }

    public Bibliothecaire(String reference, String nom, String prenom, String email) {
        super(reference, nom, prenom, email, Role.ADMIN);
    }

}
