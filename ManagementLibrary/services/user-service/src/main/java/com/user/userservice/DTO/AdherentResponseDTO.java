package com.user.userservice.DTO;


import com.user.userservice.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class AdherentResponseDTO extends UtilisateurResponseDTO {

    private String ecole;

}
