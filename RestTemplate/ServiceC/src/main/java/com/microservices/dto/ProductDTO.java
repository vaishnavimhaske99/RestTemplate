package com.microservices.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private double price;

    // Getters and Setters
}
