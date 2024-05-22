package com.cydeo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@Component
public class Cart {

    private Map<Product, Integer> productMap;
    private BigDecimal cartTotalAmount;
}
