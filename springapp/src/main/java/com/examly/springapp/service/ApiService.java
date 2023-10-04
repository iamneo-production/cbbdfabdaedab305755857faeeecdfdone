package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import java.util.List;

public class LaptopService{

    public List getAllLaptops(){
        return (list) getClass(Laptop);
    }

    public Laptop postLaptop(){
        Laptop newLaptopId = newLaptopId.setLaptopId(laptopId);
        Laptop newLaptopBrand = newLaptopBrand.setLaptopBrand(laptopBrand);
        Laptop newLaptopPrice = newLaptopPrice.setLaptopPrice(); 
        return Laptop;
    }
}
