package com.examly.springapp.model;

import jakarta.persistence.*;

@Table (name = "laptop")
public class Laptop{

    @Id
    private int laptopId;

    @Column (name = "laptopBrand")
    private String laptopBrand;

    @Column (name = "laptopPrice")
    private int laptopPrice;

    public Laptop(){

    }

    public Laptop(int laptopId, String laptopBrand, int laptopPrice){
        this.laptopId=laptopId;
        this.laptopBrand=laptopBrand;
        this.laptopPrice=laptopPrice;
    }

    public int getLaptopId(){
        return laptopId;
    }

    public void setLaptopId(int laptopId){
        this.laptopId=laptoId;
    }

    public String getLaptopBrand(){
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand){
        this.laptopBrand=laptopBrand;
    }

    public int getLaptopPrice(){
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice){
        this.laptopPrice=laptopPrice;
    }

}