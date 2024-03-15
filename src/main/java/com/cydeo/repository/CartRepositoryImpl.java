package com.cydeo.repository;


import com.cydeo.model.Product;

public class CartRepositoryImpl implements CartRepository {

    public boolean addCartDatabase(Product product, int quantity) {
        System.out.println(product.getName() + " is added to database");
        return true;
    }
}
