package com.microservices.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private String userId;

    public Order() {
    }
    
    public Order(Long id, String product, String userId) {
        this.id = id;
        this.product = product;
        this.userId = userId;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}