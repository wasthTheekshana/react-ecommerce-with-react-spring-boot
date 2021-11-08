package com.wasthDev.reactecommerce.service;

import com.wasthDev.reactecommerce.model.Products;
import com.wasthDev.reactecommerce.repository.CatergoryRepository;
import com.wasthDev.reactecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CatergoryRepository catergoryRepository;

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }
}
