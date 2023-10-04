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

    public Laptop(int laptopid, String laptopBrand, int laptopPrice){
        this.laptopid=laptopid;
        this.laptopBrand=laptopBrand;
        this.laptopPrice=laptopPrice;
    }

    public int getLaptopId(){
        return laptopid;
    }

    public void setLaptopId(int laptopid){
        this.laptopid=laptopid;
    }

    public String getLaptopBrand(){
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand){
        this.laptopBrand=laptopBrand;
    }

    public int getLaptopPrice(){
        return laptopid;
    }

    public void setLaptopPrice(int laptopPrice){
        this.laptopPrice=laptopPrice;
    }

}