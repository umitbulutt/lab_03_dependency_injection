package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@Component
public class Product {

    private String name;
    private int quantity;
    private int remainingQuantity;
    private BigDecimal price;
}
