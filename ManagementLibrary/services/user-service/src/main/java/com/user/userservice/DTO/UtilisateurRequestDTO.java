package com.user.userservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class UtilisateurRequestDTO {

    protected String nom;
    protected String prenom;
    protected String email;
    protected String motDePasse;

}
