package com.stock.stockservice.controler;


import com.stock.stockservice.DTO.StockRequestDTO;
import com.stock.stockservice.DTO.StockResponseDTO;
import com.stock.stockservice.model.StockItem;
import com.stock.stockservice.repository.StockRepository;
import com.stock.stockservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class StockRestControler {

    private StockRepository stockRepository;

   /* @Autowired
    private BookMapper bookMapper;
       */

   private StockService stockService;


    public StockRestControler(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping("/stocks")
    public List<StockItem> getStocks() {
        return stockRepository.findAll();
    }

    @GetMapping("/stocks/{id}")
    public StockItem getStocks (@PathVariable Long id) {
        return stockRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Le livre %s est introuvable !!",id)));
    }

    @PutMapping("/stocks/{id}")
    public StockItem updateStock (@PathVariable Long id, @RequestBody StockItem newStock) {
        StockItem oldStock= stockRepository.findById(id).orElseThrow();

        oldStock.setType(newStock.getType());
        oldStock.setCapacite(newStock.getCapacite());
        oldStock.setQuantite(newStock.getQuantite());

        return stockRepository.save(oldStock);
    }

    @PostMapping("/stocks")
    public StockResponseDTO saveStock (@RequestBody StockRequestDTO stockRequestDTO) {
        return stockService.addStock(stockRequestDTO);
    }

    @DeleteMapping("/stocks/{id}")
    public void deleteStock (@PathVariable Long id) {
        StockItem stockItem = stockRepository.findById(id).orElseThrow(()-> new RuntimeException("Le stock de " + id + "  est introuvable !!"));
        if ( stockItem != null ) stockRepository.delete(stockItem);
    }

}
