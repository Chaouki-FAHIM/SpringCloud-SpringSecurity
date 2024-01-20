package com.stock.stockservice;

import com.stock.stockservice.model.Categorie;
import com.stock.stockservice.model.StockItem;
import com.stock.stockservice.repository.StockRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class StockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(StockRepository stockRepository){
		return args -> {
			stockRepository.save( new StockItem(1L, UUID.randomUUID().toString(),Categorie.JEUNESSE,2,250) );
			stockRepository.save( new StockItem(2L, UUID.randomUUID().toString(),Categorie.FICTION,3,210) );
		};
	}
}
