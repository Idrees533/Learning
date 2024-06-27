package com.learn.product_service.service;

import com.learn.product_service.dto.ProductRequest;
import com.learn.product_service.dto.ProductResponse;
import com.learn.product_service.model.Product;
import com.learn.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
//we can do initialize the product repository
   /* public productService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
*/
    public ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice()).build();

        productRepository.save(product);
        log.info("product {} is saved", product.getId());
        ProductResponse productResponse =new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setPrice(product.getPrice());
        return ResponseEntity.ok(productResponse);
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
//mapping the products to productResponse
return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());

    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
