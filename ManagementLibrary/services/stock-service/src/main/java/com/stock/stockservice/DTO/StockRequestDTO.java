package com.stock.stockservice.DTO;


import com.stock.stockservice.model.Categorie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class StockRequestDTO {

    private String reference;
    private Categorie type;
    private int quantite;

}
