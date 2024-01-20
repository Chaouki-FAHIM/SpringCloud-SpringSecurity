package com.user.userservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class UtilisateurResponseDTO {

    protected Long id;
    protected String reference;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String motDePasse;

}
