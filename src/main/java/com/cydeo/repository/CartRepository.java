package com.cydeo.repository;

import com.cydeo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;


public interface CartRepository {



    boolean addCartDatabase(@Autowired Product product, int quantity);
}
