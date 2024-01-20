package com.stock.stockservice.service;


import com.stock.stockservice.DTO.StockRequestDTO;
import com.stock.stockservice.DTO.StockResponseDTO;

public interface StockService {
    StockResponseDTO addStock(StockRequestDTO stockRequestDTO);
    StockResponseDTO updateStock(StockRequestDTO stockRequestDTO);
}
