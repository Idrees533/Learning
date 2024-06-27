package com.learn.product_service.controller;

import com.learn.product_service.dto.ProductRequest;
import com.learn.product_service.dto.ProductResponse;
import com.learn.product_service.model.Product;
import com.learn.product_service.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//as we expose the service or api we need restcontroller and requestmappign
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        ResponseEntity<ProductResponse> productResponse = productService.createProduct(productRequest);
        return productResponse;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
        public List<ProductResponse> getAllProducts() {
      return productService.getAllProducts();
    }
}
