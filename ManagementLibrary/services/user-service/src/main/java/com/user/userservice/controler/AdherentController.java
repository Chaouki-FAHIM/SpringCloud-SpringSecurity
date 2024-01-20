package com.user.userservice.controler;


import com.user.userservice.DTO.AdherentRequestDTO;
import com.user.userservice.DTO.AdherentResponseDTO;
import com.user.userservice.mapper.UtilisateurMapper;
import com.user.userservice.model.Adherent;
import com.user.userservice.repository.AdherentRepository;
import com.user.userservice.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdherentController implements UtilisateurController<AdherentResponseDTO, AdherentRequestDTO,Long> {

    private AdherentRepository adherentRepository;

    @Autowired
    @Qualifier("adherentService")
    private UtilisateurService<AdherentResponseDTO, AdherentRequestDTO, Long> iService;


    @Autowired
    public AdherentController(AdherentRepository adherentRepository) {
        this.adherentRepository = adherentRepository;
    }

    @Override
    @GetMapping("/adherents/{id}")
    public AdherentResponseDTO getOneById(@PathVariable Long id) {
        return iService.findOneUser(id);
    }

    @Override
    @GetMapping("/adherents")
    public List<AdherentResponseDTO> getAll() {
        return iService.findAllUser();
    }

    @Override
    @PostMapping("/adherents")
    public AdherentResponseDTO save(@RequestBody AdherentRequestDTO adherentRequestDTO) {
        return iService.addUser(adherentRequestDTO);
    }

    @Override
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) {
        Adherent adherent = adherentRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Le livre de %s est introuvable !!",id)));
        if ( adherent != null ) iService.deleteUser(id);
    }

}
