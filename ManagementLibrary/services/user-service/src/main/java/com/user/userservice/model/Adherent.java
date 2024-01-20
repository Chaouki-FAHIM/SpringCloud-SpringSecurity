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
public class Adherent extends Utilisateur {

    @Column(name = "ecole")
    private String ecole;

    public Adherent(String reference, String nom, String prenom, String email,String ecole) {
        super(reference, nom, prenom, email, Role.ADHERENT);
        this.ecole = ecole;
    }
}
