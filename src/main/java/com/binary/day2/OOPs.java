package com.binary.day2;

public class OOPs {
    public static void main(String[] args) {
//        OOP: Object Oriented programming
//        1. Class
//        2. Object
//        Class => is a template/blueprint for creating objects
//          - attributes: holds data
//          - methods: modify the data or perform certain tasks or actions
//        Class             vs              Object
//        - car             =>              (toyota, mazda6, volvo x86, lexus Rx350)
//        note: objects (physical present of class) are created using class
//        class has attributes and methods.
//        - attributes: model, color; doors, price
//        - methods: drive(), stop(), accelerate(), reverse()
//          airplane: is a class.
//          objects of airplane are: jet plane, boeing 350
//          fruit is a class. objects: orange, apple, grapes
//          candy is a class. objects:
//          animal is a class. objects: dog, cat,
//       -> how to create a class? public class className{
//          attributes
//          methods
//        }
//       -> how to create an object using class?
//        ClassName objName = new ClassName();
        Car toyota = new Car();
        toyota.color = "blue";
        toyota.doors = 4;
        toyota.mfgYear = 2024;
        toyota.millage = 10000;
        toyota.model = "camry XLE";
        toyota.price = 40000;
        System.out.println(toyota.color);
        toyota.drive();
        toyota.driveBy(20);
        System.out.println("After: "+ toyota.millage);

        Fruit f = new Fruit();
         f.color = "yellow";
         f.name = "Apple";
        System.out.println("Fruit name is: "+f.name);
//        How to create methods?
//          1- Simple method: public void methodName(){ code}
//          2- Method that accepts input: public void methodName(datatype inputName){ code }
//          3- Return methods
//        How to call a method?
//          objRef.methodName();
//        updating attributes: setters (don't have return type) (void method)
//        getting attributes values: getters
    }
}
