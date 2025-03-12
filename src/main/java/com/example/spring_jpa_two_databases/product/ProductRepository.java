package com.example.spring_jpa_two_databases.product;

import com.example.spring_jpa_two_databases.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
