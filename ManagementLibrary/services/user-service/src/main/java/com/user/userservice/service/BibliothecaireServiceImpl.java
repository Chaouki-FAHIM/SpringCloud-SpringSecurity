package com.user.userservice.service;

import com.user.userservice.DTO.BibliothecaireRequestDTO;
import com.user.userservice.DTO.BibliothecaireResponseDTO;
import com.user.userservice.mapper.UtilisateurMapper;
import com.user.userservice.repository.BibliothecaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("bibliothecaireService")
public class BibliothecaireServiceImpl implements UtilisateurService<BibliothecaireResponseDTO,BibliothecaireRequestDTO,Long> {

    private BibliothecaireRepository bibliothecaireRepository;

    @Autowired
    private UtilisateurMapper bibliothecaireMapper;

    @Autowired
    public BibliothecaireServiceImpl(BibliothecaireRepository bibliothecaireRepository) {
        this.bibliothecaireRepository = bibliothecaireRepository;
    }


    @Override
    public BibliothecaireResponseDTO addUser(BibliothecaireRequestDTO bibliothecaireRequestDTO) {
        return null;
    }

    @Override
    public BibliothecaireResponseDTO updateUser(BibliothecaireRequestDTO bibliothecaireRequestDTO) {
        return null;
    }

    @Override
    public List<BibliothecaireResponseDTO> findAllUser() {
        return null;
    }

    @Override
    public BibliothecaireResponseDTO findOneUser(Long aLong) {
        return null;
    }

    @Override
    public void deleteUser(Long aLong) {

    }
}

