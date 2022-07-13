package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/allProducts")
    @ApiOperation(value = "Responsável por retornar uma lista de produtos")
    @ApiResponse(code = 11, message = "Warning - the process returned more than 1000 products.")
    public List<Product> allProducts(){
        return productRepository.getAllProducts();
    }

    @PostMapping("/addProduct")
    @ApiOperation(value = "Responsável por retornar uma lista de produtos")
    @ApiResponse(code = 10, message = "Required fields not informed.")
    public void addProduct(@RequestBody Product product ){
         productRepository.addProduct(product);
    }

    @GetMapping("/findProductById/{id}")
    @ApiOperation(value = "Responsável por retornar uma lista de produtos")
    @ApiResponse(code = 12, message = "The field id not informed. This information is required.")
    public Product findProductById(@RequestParam("id") Integer id){
        return productRepository.getProductById(id);
    }

    @DeleteMapping("/removeProduct")
    @ApiOperation(value = "Responsável por retornar uma lista de produtos")
    @ApiResponse(code = 13, message = "User not allowed to remove a product from this category.")
    public void removeProduct(@RequestBody Product product){
        productRepository.removeProduct(product);
    }

    @PutMapping("/removeProduct")
    @ApiOperation(value = "Responsável por retornar uma lista de produtos")
    @ApiResponse(code = 14, message = "No information has been updated. The new information is the same as recorded in the database.")
    public void updateProduct(@RequestBody Product product){
        productRepository.updateProduct(product);
    }
}
