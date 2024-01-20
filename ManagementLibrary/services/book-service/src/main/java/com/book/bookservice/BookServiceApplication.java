package com.book.bookservice;


import com.book.bookservice.model.*;
import com.book.bookservice.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
@ComponentScan(basePackages = "com.book.bookservice")


public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BookRepository bookRepository) {
		return args -> {
			bookRepository.save(new Book(1L, UUID.randomUUID().toString(), new Date(),"Book 1","Auteur 1","Editeur 1", Langue.ANGLAIS, Categorie.JEUNESSE, GenreLivre.AVENTURE,"Descrption", EtatLivre.EXISTE,210));
			bookRepository.save(new Book(2L, UUID.randomUUID().toString(), new Date(),"Book 2",null, null, Langue.ARABE, Categorie.BANDES_DESSINEES_MANGAS, GenreLivre.DYSTOPIE,"Descrption",EtatLivre.EXISTE,50));
		};
	}
}
