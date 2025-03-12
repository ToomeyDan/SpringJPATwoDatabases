package com.example.spring_jpa_two_databases.product;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ProductDataInitializer {

    private final ProductRepository productRepository;

    public ProductDataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void init() {
        if (productRepository.count() == 0) {
            productRepository.save(Product.builder()
                    .name("Table")
                    .price(200.0)
                    .build());
            productRepository.save(Product.builder()
                    .name("Chair")
                    .price(50.0)
                    .build());
        }
    }
}

