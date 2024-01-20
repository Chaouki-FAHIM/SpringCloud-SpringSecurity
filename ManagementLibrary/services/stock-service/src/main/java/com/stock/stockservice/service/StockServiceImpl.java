package com.stock.stockservice.service;

import com.stock.stockservice.DTO.StockRequestDTO;
import com.stock.stockservice.DTO.StockResponseDTO;
import com.stock.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public StockResponseDTO addStock(StockRequestDTO stockRequestDTO) {
        return null;
    }

    @Override
    public StockResponseDTO updateStock(StockRequestDTO stockRequestDTO) {
        return null;
    }
}
