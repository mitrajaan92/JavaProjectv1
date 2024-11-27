package com.binary.day1;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        --------------function 1------------------
        System.out.println("Enter an integer to check if it is positive or negative or zero: ");
        int num=s.nextInt();
        if(num > 0){
            System.out.println("Positive integer!");
        }
        else if(num <0){
            System.out.println("Negative integer");
        }
        else if(num == 0){
            System.out.println("It is a zero");
        }
        else {
            System.out.println("Not an integer");
        }
//        --------------function 2 ------------------
        System.out.println("Please enter an integer to verify if it is odd or even: ");
        int num2 = s.nextInt();
        if( num2%2 ==0){
            System.out.println("It is even!");
        }
        else{
            System.out.println("It is odd!");
        }

//        --------------function 3 ------------------
        System.out.println("Please enter your grade: ");
        int grade = s.nextInt();
        if(grade >=90 && grade <=100){
            System.out.println("Grade: A ");
        }
        else if(grade >=80 && grade <=89){
            System.out.println("Grade: B ");
        }
        else if(grade >=70 && grade <=79){
            System.out.println("Grade: C ");
        }
        else if(grade >=60 && grade <=69){
            System.out.println("Grade: D ");
        }
        else{
            System.out.println("Grade: F ");
        }
//        --------------function 4 ------------------
        System.out.println("Triangle: Please enter side 1: ");
        double side1 = s.nextDouble();
        System.out.println("Triangle: Please enter side 2: ");
        double side2 = s.nextDouble();
        System.out.println("Triangle: Please enter side 3: ");
        double side3 = s.nextDouble();
        if( side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("The triangle is equilateral.");
        }
        else if( side1 == side2 || side2 == side3 || side1==side3 ){
            System.out.println("The triangle is isosceles.");
        }
        else if( side1 != side2 && side1 != side3 && side2 != side3){
            System.out.println("The triangle is scalene.");
        }
        else{
            System.out.println("Not a triangle.");
        }
//        --------------function 5 ------------------
        System.out.println("Please enter an integer to check for positive, negative, odd or even:");
        int num3 = s.nextInt();
        if(num3 == 0){
            System.out.println("Zero!");
        }
        else if(num3 %2 == 0 && num3 > 0){
            System.out.println("Positive and even!");
        }
        else if(num3 %2 == 0 && num3 < 0){
            System.out.println("Negative and even!");
        }
        else if(num3 %2 != 0 && num3 > 0){
            System.out.println("Positive and odd!");
        }
        else if(num3 %2 != 0 && num3 < 0){
            System.out.println("Negative and odd!");
        }
        else{
            System.out.println("Not a valid integer!");
        }
//        --------------function 6 (sum natural numbers------------------
        System.out.println("Please enter N:");
        int n = s.nextInt();
        int counter = 1;
        int sum = 0;
        while( n > 0){
            sum = sum + counter;
            counter++;
            n--;
        }
        System.out.println("The sum is: "+sum);
//        --------------function 7 (multiplication)------------------
        System.out.println("Please enter an integer to print its multiplication table up to 10:");
        int num4 = s.nextInt();
        int result;
        for(int i=1; i<=10; i++){
            result = num4*i;
            System.out.println(result);
        }
//        --------------function 8 (prime numbers)------------------
        for (int num5 = 2; num5 <= 100; num5++) {
            boolean isPrime = true;
            for (int i = 2; i* i <= num5; i++) {
                if (num5 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number: "+ num5 );
            }
        }

    }
}
