package com.microservices.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    // Getters and Setters
}
