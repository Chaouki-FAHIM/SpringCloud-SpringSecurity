package com.user.userservice.controler;


import com.user.userservice.DTO.BibliothecaireRequestDTO;
import com.user.userservice.DTO.BibliothecaireResponseDTO;
import com.user.userservice.mapper.UtilisateurMapper;
import com.user.userservice.model.Bibliothecaire;
import com.user.userservice.repository.BibliothecaireRepository;
import com.user.userservice.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BibliothecaireController implements UtilisateurController<BibliothecaireResponseDTO, BibliothecaireRequestDTO,Long> {

    private BibliothecaireRepository bibliothecaireRepository;

    @Autowired
    @Qualifier("bibliothecaireService")
    private UtilisateurService<BibliothecaireResponseDTO, BibliothecaireRequestDTO, Long> iService;


    @Autowired
    public BibliothecaireController(BibliothecaireRepository bibliothecaireRepository) {
        this.bibliothecaireRepository = bibliothecaireRepository;
    }

    @Override
    @GetMapping("/bibliothecaires/{id}")
    public BibliothecaireResponseDTO getOneById(@PathVariable Long id) {
        return iService.findOneUser(id);
    }

    @Override
    @GetMapping("/bibliothecaires")
    public List<BibliothecaireResponseDTO> getAll() {
        return iService.findAllUser();
    }

    @Override
    @PostMapping("/bibliothecaires")
    public BibliothecaireResponseDTO save(@RequestBody BibliothecaireRequestDTO bibliothecaireRequestDTO) {
        return iService.addUser(bibliothecaireRequestDTO);
    }

    @Override
    @DeleteMapping("/bibliothecaires/{id}")
    public void delete(@PathVariable Long id) {
        Bibliothecaire bibliothecaire = bibliothecaireRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Le livre de %s est introuvable !!",id)));
        if ( bibliothecaire != null ) iService.deleteUser(id);
    }

}
