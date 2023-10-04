package com.examly.model;

import jakarta.persistence.*;

@Table (name = "laptop")
public class Laptop{

    @Id
    private int laptopid;

    @Column (name = "laptopBrand")
    private String laptopBrand;

    @Column (name = "laptopPrice")
    private int laptopPrice;

    public Laptop(){

    }

    public Laptop(int laptop, String laptopBrand, in)


}