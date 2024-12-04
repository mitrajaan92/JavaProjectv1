package com.binary.day5;

import com.binary.day5.loan.LoanApplication;

public class FourPillarsOfJava3 {
    public static void main(String[] args) {
//       3- polymorphism: poly: many. morphism: change to different form
//        Multiple methods that do the same operations, have the same name.
//        ex: add(int , int) or add(int, double) // returnType should be the largest type -> double as returnType
//        - compile time: before running the code
//        - runtime: while running the code
//        -types:
//          1- compile time polymorphism => Method overloading:
//              - will be used when method should have different number of parameters with the same datatype or
//                 different datatypes with the same number of parameters within the same class.
//              - method name is the same
//          2- runtime polymorphism => Method overriding
//              - will be used when there are two classes having inheritance relationship and both are having
//                  the same method with different implementation.
//              - use the keyword @override to change the body only
//              ex: Father -> style() and Son extends Father -> style()
//        ------------------------------------------------------------------------------------
//        4- Abstraction: hiding the implementation (encapsulation is hiding the data)
//              - to achieve this, we can use three different ways:
//                  1- using private method: (ex: LoanApplication class)
//                  2- abstract class: use the keyword "abstract". (ex: abstract class)
//                           - you cannot create object with abstract class.
//                           - abstract method can only be created inside the abstract class and should be public
//                                ex: public abstract double calcRate();
//                           - abstract methods don't have a body;
//                           - any class that extends the abstract class needs to provide the methods body
//                              or the implementation for the abstract class.
//
//                           - example: look at github -> day3and4and5 -> loan package
//                           - in abstract class, we can have normal methods and abstract methods
//
//                  3- interfaces: if we want more abstraction, we use interfaces. (ex: files package)
//                      ***interface sets rules for any class which wants to implements it.
//                      ***// multiple inheritance is not possible for classes, but it is possible for interfaces
//                      *** public class WordDoc implements Readable,Writable {...}
//                           - interface is a completely abstract class, means only abstract methods are allowed.
//                                -> normal methods are NOT allowed.
//                           - only abstract methods are allowed.
//                           - to access the interface methods, the interface must be implemented by another class
//                               and here we will use the keyword "implements"
//                           - public interface InterfaceName{... }  // no use of a "class"
//                              -> public class anotherClass implements InterfaceA{...}
//                      Rules:
//                          - cant be used to create object
//                          - can only have abstract methods
//                          - any class implementing the interface, needs to implement the abstract method
//                          - in interface all the methods by default are "public", not "default"
//                          - in interface, we cannot have constructors
//                          - in interface, if we create an attribute, it should be public, static and final

//


        Calc cal = new Calc();
        int sum = cal.add(3, 5); //overloading polymorphism is a compile time polymorphism which
//        the methods are in the same class, with the same names, but different number of parameters or different parameters types.
        System.out.println(sum);

        Father father = new Father();
        Son son = new Son();
        father.style();
        son.style();

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sound();
        dog.sound();
        LoanApplication l = new LoanApplication(10000,"John","abcd", 3000,3000);
        System.out.println(l.calcRate());

    }
}
