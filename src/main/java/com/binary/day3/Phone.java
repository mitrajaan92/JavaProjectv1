package com.binary.day3;

public class Phone {
    private String color;
    private String brand;
    private double price;
    private String model;

    //    Default constructor
    public Phone() {

    }

    //    parametrized constructors
    public Phone(String inputColor, String inputBrand, String inputModel, double inputPrice) {
        color = inputColor;
        brand = inputBrand;
        model = inputModel;
        price = inputPrice;
    }
    //    parametrized constructors
    public Phone(String inputBrand, String inputModel) {
        brand = inputBrand;
        model = inputModel;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}



