package com.stock.stockservice.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = StockItem.class, name="p4")
public interface StockProjection {
    public String getId();
    public Categorie getType();
}
