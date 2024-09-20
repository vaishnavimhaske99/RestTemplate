package com.microservices.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private Long id;
    private String product;
    private String userId;

    // Getters and Setters
}
