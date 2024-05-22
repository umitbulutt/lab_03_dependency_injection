package com.cydeo.repository;


import com.cydeo.model.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component

public class CartRepositoryImpl implements CartRepository {

    public boolean addCartDatabase(Product product, int quantity) {
        System.out.println(product.getName() + " is added to database");
        return true;
    }
}
