package com.user.userservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class BibliothecaireResponseDTO extends UtilisateurResponseDTO {

    private String empalcement;
}
