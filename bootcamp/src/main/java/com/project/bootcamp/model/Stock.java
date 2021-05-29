package com.project.bootcamp.model.;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
    private Long id;

@Column(name = "price")
private String name;

@Column(name = "price")
    private Double price;

    @Column (name = "variation")
    private  Double variation;

    @Column(name = "date")
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public static void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public static void setPrice(Double price) {
        this.price = price;
    }

    public Double getVariation() {
        return variation;
    }

    public static void setVariation(Double variation) {
        this.variation = variation;
    }

    public LocalDate getDate() {
        return date;
    }

    public static void setDate(LocalDate date) {
        this.date = date;
    }
}
