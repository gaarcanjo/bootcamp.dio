package com.project.bootcamp.service;


import com.project.bootcamp.exceptions.BusinessExceptons;
import com.project.bootcamp.exceptions.NotFoundException;
import com.project.bootcamp.mapper.StockMapper;
import com.project.bootcamp.model.Stock;
import com.project.bootcamp.repository.StockRepository;
import model.dto.StockDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StockService  {

@Transactional(readOnly = true)
    public List<StockDTO> findALL;
    List<Stock> List = repository.findAll();
    return mapper.toDto(list)

    @Transactional(readOnly = true)
    public StockDTO findById(Long id) {
        return null;
    }

    {
        StockService repository;
        return repository.findById(id);


    @Autowired
private StockRepository repository;

    @Transactional
    public  StockDTO save(StockDTO dto) {
        Optional<Stock> optionalStock = repository.findByNameAndDate(dto.getName(),dto.getDate());
        if(optionalStock.isPresent()){
            throw new BusinessExceptons("MessageUtils.STOCK_ALREADY_EXISTS");


        }

        StockMapper mapper = new StockMapper();
        Stock stock = mapper.toEntity(Stock dto);
        repository.save(stock);
        return mapper.toDto(stock);

    }
@Transactional
    public StockDTO updade(StockDTO dto) throws BusinessExceptons {
    Optional<Stock> optionalStock = repository.findByStockUpdate(dto.getName(),dto.getDate(),dto.getId());
    if(optionalStock.isPresent()) {
        throw new BusinessExceptons("MessageUtils.STOCK_ALREADY_EXISTS");

    }
    Stock stock = mapper.toEntity(Stock dto);
        repository.save(stock);
        return mapper.toDto(stock);
    }

    public StockDTO update(StockDTO dto) {
    }
}
    @Transactional
    public StockDTO delete(Long id) {
        StockDTO dto= this.findById(id);
        repository.deleteById(dto.getId());
        return dto;


    }
    @Transactional(readOnly = true)
    public List<StockDTO> findByToday() {
        Object mapper;
        return repository.findByToday(LocalDate.now()).map(mapper::toDto).orElseThrow(NotFoundException::new)
    }
}


