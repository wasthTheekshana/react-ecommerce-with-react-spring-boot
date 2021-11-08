package com.wasthDev.reactecommerce.repository;

import com.wasthDev.reactecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
