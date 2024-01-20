package com.loan.loanservice.DTO;

import com.loan.loanservice.model.EtatEmprunt;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class EmpruntResponseDTO {

    private Long id;

    private String reference;

    private Long adherent;

    private List<Long> books;

    private Date dateCreation;

    private Date dateRecuperation;

    private Date dateRetour;

    private EtatEmprunt etat;
}
