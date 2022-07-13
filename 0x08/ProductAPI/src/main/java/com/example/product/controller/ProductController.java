package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/allProducts")
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
