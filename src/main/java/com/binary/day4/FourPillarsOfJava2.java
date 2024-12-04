package com.binary.day4;

public class FourPillarsOfJava2 {
    public static void main(String[] args) {


//    1- encapsulation: to make sure sensitive data are hidden from the user
//    2- inheritance: to inherit attributes and methods from one class to another class
//      - to inherit from one class to another class, use the keyword: extends
//      - subclass or child class: the classes that inherits from another class (parent)
//      - super class or parent class: provides the inheritance to a child or a subclass
//      - keyword "super" : it is used to access the parents methods or attributes in the child class
//      - for all the objects in java, parent class is java.
        Parent p = new Parent();
        Child c = new Child();
        c.setLastName("Jojo");
        c.setFirstName("Jo");



    }//main
}
