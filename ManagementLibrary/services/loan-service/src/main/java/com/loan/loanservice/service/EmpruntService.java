package com.loan.loanservice.service;


import com.loan.loanservice.DTO.EmpruntRequestDTO;
import com.loan.loanservice.DTO.EmpruntResponseDTO;

public interface EmpruntService {
    EmpruntResponseDTO addEmprunt(EmpruntRequestDTO bookRequestDTO);
}
