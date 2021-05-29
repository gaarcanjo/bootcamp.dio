package com.project.bootcamp.mapper;


import com.project.bootcamp.model.Stock;
import model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto){
        Stock stock = new Stock();
        Stock.setId(dto.getId());
        Stock.setName(dto.getNome());
        Stock.setPrice(dto.getPrice());
        Stock.setVariation(dto.getVariation());
        Stock.setDate(dto.getDate());
        return stock;

    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setId(dto.getId());
        dto.setName(dto.getNome());
        dto.setPrice(dto.getPrice());
        dto.setVariation(dto.getVariation());
        dto.setDate(dto.getDate());


        public List<StockDTO> toDto(List<Stock> listStock){
            return listStock.stream().map(this::toDto).collect(Collectors.toList())
        }
    }
}
