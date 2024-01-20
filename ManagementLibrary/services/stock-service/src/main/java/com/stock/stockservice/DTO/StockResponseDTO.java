package com.stock.stockservice.DTO;

import com.stock.stockservice.model.Categorie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StockResponseDTO {
    private Long id;
    private String reference;
    private Categorie type;
    private int quantite;
}

