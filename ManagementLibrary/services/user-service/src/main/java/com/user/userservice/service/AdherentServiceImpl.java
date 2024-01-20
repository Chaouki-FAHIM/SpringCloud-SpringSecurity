package com.user.userservice.service;


import com.user.userservice.DTO.AdherentRequestDTO;
import com.user.userservice.DTO.AdherentResponseDTO;
import com.user.userservice.mapper.UtilisateurMapper;
import com.user.userservice.repository.AdherentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("adherentService")
public class AdherentServiceImpl implements UtilisateurService<AdherentResponseDTO,AdherentRequestDTO,Long> {

    private AdherentRepository adherentRepository;

    @Autowired
    private UtilisateurMapper adherentMapper;

    @Autowired
    public AdherentServiceImpl(AdherentRepository adherentRepository) {
        this.adherentRepository = adherentRepository;
    }

    @Override
    public AdherentResponseDTO addUser(AdherentRequestDTO adherentRequestDTO) {
        return null;
    }

    @Override
    public AdherentResponseDTO updateUser(AdherentRequestDTO adherentRequestDTO) {
        return null;
    }

    @Override
    public List<AdherentResponseDTO> findAllUser() {
        return null;
    }

    @Override
    public AdherentResponseDTO findOneUser(Long aLong) {
        return null;
    }

    @Override
    public void deleteUser(Long aLong) {

    }
}

