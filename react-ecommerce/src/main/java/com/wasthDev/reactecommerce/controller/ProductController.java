package com.wasthDev.reactecommerce.controller;

import com.wasthDev.reactecommerce.model.Products;
import com.wasthDev.reactecommerce.repository.ProductRepository;
import com.wasthDev.reactecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    final
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("getAll")
    public List<Products> getAll(){
       return productService.getAllProducts();
    }
}
