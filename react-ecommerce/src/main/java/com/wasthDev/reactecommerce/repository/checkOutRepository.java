package com.wasthDev.reactecommerce.repository;

import com.wasthDev.reactecommerce.model.CheckOutCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface checkOutRepository extends JpaRepository<CheckOutCart, Long> {
    @Query("Select checkCart  FROM CheckOutCart checkCart WHERE checkCart.user_id=:user_id")
    List<CheckOutCart> getByuserId(@Param("user_id")Long user_id);

}
