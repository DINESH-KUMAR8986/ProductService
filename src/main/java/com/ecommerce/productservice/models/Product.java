package com.ecommerce.productservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Product {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String image;
    private String category;
}
