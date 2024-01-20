package com.loan.loanservice.controler;

import com.loan.loanservice.DTO.EmpruntRequestDTO;
import com.loan.loanservice.DTO.EmpruntResponseDTO;
import com.loan.loanservice.model.Emprunt;
import com.loan.loanservice.repository.EmpruntRepository;
import com.loan.loanservice.service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public class EmpruntRestControler {

    private EmpruntRepository empruntRepository;


    private EmpruntService empruntService;
    public EmpruntRestControler(EmpruntRepository empruntRepository) {
        this.empruntRepository = empruntRepository;
    }

    @GetMapping("/emprunts/{id}")
    public Emprunt getEmprunt(@PathVariable Long id) {
        return empruntRepository.findById(id).orElseThrow(() -> new RuntimeException("Emprunt"+ id + " est introuvable !!"));
    }

    @GetMapping("/emprunts")
    public List<Emprunt> getBooks() {
        return empruntRepository.findAll();
    }

    @PutMapping("/emprunts/{id}")
    public Emprunt updateEmprunt (@PathVariable Long id, @RequestBody Emprunt newEmprunt) {
        Emprunt oldEmprunt= empruntRepository.findById(id).orElseThrow();

        // modifier les champs qui sont nulls
        if(newEmprunt.getDateRecuperation()!=null) oldEmprunt.setDateRecuperation(newEmprunt.getDateRecuperation());
        if(newEmprunt.getDateRetour()!=null) oldEmprunt.setDateRetour(newEmprunt.getDateRetour());
        if(newEmprunt.getBook()!=null) oldEmprunt.setBook(newEmprunt.getBook());

        // modifier les champs par les nouvelles valeurs
        oldEmprunt.setReference(newEmprunt.getReference());
        oldEmprunt.setAdherent(newEmprunt.getAdherent());
        oldEmprunt.setEtat(newEmprunt.getEtat());

        return empruntRepository.save(oldEmprunt);
    }

    @PostMapping("/emprunts")
    public EmpruntResponseDTO saveEmprunt (@RequestBody EmpruntRequestDTO empruntRequestDTO) {
        return empruntService.addEmprunt(empruntRequestDTO);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook (@PathVariable Long id) {
        Emprunt emprunt= empruntRepository.findById(id).orElseThrow(()-> new RuntimeException("Operation/Demande d'emprunt du de "+ id + " est introuvable !!"));
        if ( emprunt != null ) empruntRepository.delete(emprunt);
    }

}
