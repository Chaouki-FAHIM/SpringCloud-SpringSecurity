package com.user.userservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor
public class AdherentRequestDTO extends UtilisateurRequestDTO {

    private String ecole;
}
