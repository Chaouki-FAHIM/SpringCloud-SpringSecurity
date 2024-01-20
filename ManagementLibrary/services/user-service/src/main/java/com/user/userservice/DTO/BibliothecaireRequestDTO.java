package com.user.userservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class BibliothecaireRequestDTO extends UtilisateurRequestDTO {

    private String empalcement;
}
