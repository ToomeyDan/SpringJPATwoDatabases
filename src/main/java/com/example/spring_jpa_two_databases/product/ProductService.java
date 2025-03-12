package com.example.spring_jpa_two_databases.product;

import com.example.spring_jpa_two_databases.product.Product;
import com.example.spring_jpa_two_databases.product.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional("productTransactionManager")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
