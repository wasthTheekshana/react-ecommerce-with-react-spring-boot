package com.wasthDev.reactecommerce.controller;

import com.wasthDev.reactecommerce.model.Category;
import com.wasthDev.reactecommerce.model.Products;
import com.wasthDev.reactecommerce.repository.ProductRepository;
import com.wasthDev.reactecommerce.service.ProductService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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

    @RequestMapping("getAllCategory")
    public List<Category> getAllCategory(){
        return ProductService.getAllCategory();
    }
    @RequestMapping("getProductsByCategory")
    public List<Products> getProductsByCategory(@RequestBody HashMap<String,String> request){
        String category_id = request.get("cat_id");
        return ProductService.getProductsByCategory(category_id);
    }



    @GetMapping( value = "/getimage/{img_name}",produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody
    byte[] getImageWithMediaType(@PathVariable("img_name") String img_name) throws IOException {
        InputStream in = getClass().getResourceAsStream("/images/"+img_name);
        return IOUtils.toByteArray(in);
    }

}
