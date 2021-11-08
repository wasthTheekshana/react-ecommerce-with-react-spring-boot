package com.wasthDev.reactecommerce.repository;

import com.wasthDev.reactecommerce.model.CheckOutCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface checkOutRepository extends JpaRepository<CheckOutCart, Long> {
}
