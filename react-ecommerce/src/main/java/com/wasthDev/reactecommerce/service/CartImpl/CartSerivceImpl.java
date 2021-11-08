package com.wasthDev.reactecommerce.service.CartImpl;

import java.util.List;

import com.wasthDev.reactecommerce.model.AddToCart;
import com.wasthDev.reactecommerce.model.CheckOutCart;
import com.wasthDev.reactecommerce.model.Products;
import com.wasthDev.reactecommerce.repository.AddToCArtReopository;
import com.wasthDev.reactecommerce.repository.checkOutRepository;
import com.wasthDev.reactecommerce.service.CartService;
import com.wasthDev.reactecommerce.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CartSerivceImpl implements CartService {

    @Autowired
    AddToCArtReopository addCartRepo;
    @Autowired
    checkOutRepository checkOutRepo;
    @Autowired
    ProductService proServices;
    private static final Logger logger = LoggerFactory.getLogger(CartSerivceImpl.class);

    @Override
    public List<AddToCart> addCartbyUserIdAndProductId(long productId, long userId, int qty, double price) throws Exception {
        try {
            if(addCartRepo.getCartByProductIdAnduserId(userId, productId).isPresent()){
                throw new Exception("Product is already exist.");
            }
            AddToCart obj = new AddToCart();
            obj.setQty(qty);
            obj.setUser_id(userId);
            Products pro = proServices.getProductsById(productId);
            obj.setProducts(pro);
            //TODO price has to check with qty
            obj.setPrice(price);
            addCartRepo.save(obj);
            return this.getCartByUserId(userId);
        }catch(Exception e) {
            e.printStackTrace();
            logger.error(""+e.getMessage());
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public List<AddToCart> getCartByUserId(long userId) {
        return addCartRepo.getCartByuserId(userId);
    }

    @Override
    public List<AddToCart> removeCartByUserId(long cartId, long userId) {
        addCartRepo.deleteCartByIdAndUserId(userId, cartId);
        return this.getCartByUserId(userId);
    }

    @Override
    public void updateQtyByCartId(long cartId, int qty, double price) throws Exception {
        addCartRepo.updateQtyByCartId(cartId,price,qty);
    }

    @Override
    public Boolean checkTotalAmountAgainstCart(double totalAmount,long userId) {
        double total_amount =addCartRepo.getTotalAmountByUserId(userId);
        if(total_amount == totalAmount) {
            return true;
        }
        System.out.print("Error from request "+total_amount +" --db-- "+ totalAmount);
        return false;
    }

    @Override
    public List<CheckOutCart> getAllCheckoutByUserId(long userId) {
        return checkOutRepo.getByuserId(userId);
    }

    @Override
    public List<CheckOutCart> saveProductsForCheckout(List<CheckOutCart> tmp) throws Exception {
        try {
            long user_id = tmp.get(0).getUser_id();
            if(tmp.size() >0) {
                checkOutRepo.saveAll(tmp);
                this.removeAllCartByUserId(user_id);
                return this.getAllCheckoutByUserId(user_id);
            }
            else {
                throw  new Exception("Should not be empty");
            }
        }catch(Exception e) {
            throw new Exception("Error while checkout "+e.getMessage());
        }

    }

    @Override
    public List<AddToCart> removeAllCartByUserId(long userId) {
        addCartRepo.deleteAllCartByUserId(userId);
        return null;
    }

}