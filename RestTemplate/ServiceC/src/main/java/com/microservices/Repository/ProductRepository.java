package com.microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
