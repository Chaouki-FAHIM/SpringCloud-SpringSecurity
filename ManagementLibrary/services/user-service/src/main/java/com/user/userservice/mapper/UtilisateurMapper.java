package com.user.userservice.mapper;

import com.user.userservice.DTO.AdherentResponseDTO;
import com.user.userservice.DTO.BibliothecaireResponseDTO;
import com.user.userservice.model.Adherent;
import com.user.userservice.model.Bibliothecaire;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UtilisateurMapper {
    public AdherentResponseDTO fromAdherent(Adherent adherent) {
        AdherentResponseDTO adherentResponseDTO = new AdherentResponseDTO();
        BeanUtils.copyProperties(adherent,adherentResponseDTO);
        return adherentResponseDTO;
    }

    public BibliothecaireResponseDTO fromBibliothecaire(Bibliothecaire bibliothecaire) {
        BibliothecaireResponseDTO bibliothecaireResponseDTO = new BibliothecaireResponseDTO();
        BeanUtils.copyProperties(bibliothecaire,bibliothecaireResponseDTO);
        return bibliothecaireResponseDTO;
    }
}
