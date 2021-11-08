package com.wasthDev.reactecommerce.service;

import com.wasthDev.reactecommerce.model.AddToCart;
import com.wasthDev.reactecommerce.model.CheckOutCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    List<AddToCart> addCartbyUserIdAndProductId(long productId, long userId, int qty, double price) throws Exception;
    void updateQtyByCartId(long cartId,int qty,double price) throws Exception;
    List<AddToCart> getCartByUserId(long userId);
    List<AddToCart> removeCartByUserId(long cartId,long userId);
    List<AddToCart> removeAllCartByUserId(long userId);
    Boolean checkTotalAmountAgainstCart(double totalAmount,long userId);
    List<CheckOutCart> getAllCheckoutByUserId(long userId);
    List<CheckOutCart> saveProductsForCheckout(List<CheckOutCart> tmp)  throws Exception;


    //CheckOutCart
}