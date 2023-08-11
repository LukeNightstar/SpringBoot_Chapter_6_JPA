package com.springboot.jpa.data.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDto {

    private String name;
    private int price;
    private int stock;

}
