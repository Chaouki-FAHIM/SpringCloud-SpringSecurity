package com.stock.stockservice.repository;

import com.stock.stockservice.model.Categorie;
import com.stock.stockservice.model.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


import java.util.List;

@RepositoryRestResource
public interface StockRepository extends JpaRepository<StockItem,Long> {
    @RestResource(path = "/byType")
    List<StockItem> findByType(@Param("t") Categorie type);
}
