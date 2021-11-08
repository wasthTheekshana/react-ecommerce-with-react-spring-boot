package com.wasthDev.reactecommerce.repository;

import com.wasthDev.reactecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products,Long> {
    @Query("Select pro FROM Products pro WHERE pro.category_id=:cat_id")
    List<Products> getByCategoryId(@Param("cat_id")String cat_id);

}
