package com.wasthDev.reactecommerce.service;

import com.wasthDev.reactecommerce.model.Category;
import com.wasthDev.reactecommerce.model.Products;
import com.wasthDev.reactecommerce.repository.CatergoryRepository;
import com.wasthDev.reactecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    static
    ProductRepository productRepository;
    @Autowired
    static
    CatergoryRepository catergoryRepository;

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }
    public static List<Products>getProductsByCategory(String product_id){
        return productRepository.getByCategoryId(product_id);
    }

    public static List<Category>getAllCategory(){
        return catergoryRepository.findAll();
    }

    public Products getProductsById(long productId) throws Exception {
        return productRepository.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
    }

}
