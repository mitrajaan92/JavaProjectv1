package com.binary.day2;

public class Car {
    String model;
    String color;
    int millage;
    int doors;
    int mfgYear;
    double price;
    int currentSpeed= 0;

    public void drive(){
        System.out.println("Driving");
    }
    public void driveBy(int miles){
        millage = millage+miles;

    }
    public void updateColor(String c){
        color = c;
    }
    public int accelerateSpeed(int speed){
        currentSpeed = currentSpeed + speed;
        return currentSpeed;
    }
    public double getPrice(){
        return price;
    }
    public String getModel(){
        return model;
    }

}
