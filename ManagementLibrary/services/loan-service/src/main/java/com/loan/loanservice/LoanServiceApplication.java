package com.loan.loanservice;

import com.loan.loanservice.model.Emprunt;
import com.loan.loanservice.model.EtatEmprunt;
import com.loan.loanservice.repository.EmpruntRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class LoanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EmpruntRepository empruntRepository){
		return args -> {

			empruntRepository.save( new Emprunt(1L, UUID.randomUUID().toString(),1L, 1L, new Date(), EtatEmprunt.EN_COURS));
			empruntRepository.save( new Emprunt(2L, UUID.randomUUID().toString(),2L, 2L, new Date(), EtatEmprunt.EN_COURS));
			empruntRepository.save( new Emprunt(3L, UUID.randomUUID().toString(),1L, 1L, new Date(), EtatEmprunt.EN_COURS));

		};
	}
}
