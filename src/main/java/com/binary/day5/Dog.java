package com.binary.day5;

public class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Woof woof");
    }
}
