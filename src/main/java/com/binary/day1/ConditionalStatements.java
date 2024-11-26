package com.binary.day1;

public class ConditionalStatements {
    public static void main(String[] args) {
//        if, else if, else, switch
//        practice: write a logic if a person is a senior citizen or not
//        conditions: age >= 50 then yes
        short age = 12;
        if( age >= 20 && age < 50){
            System.out.println("This person is a teenager! ");
        }
        else if( age >= 50){
            System.out.println("This person is a senior citizen!");
        }
        else{
            System.out.println("This person is a youngster!");
        }
//switch ex: write a code to print the menu in restaurant  based on the timing.
//        breakfast, lunch, dinner,
        String timing= "lunch";
        switch(timing){
            case("breakfast"):
                System.out.println("Breakfast menu!");
                break;
            case ("lunch"):
                System.out.println("Lunch menu!");
                break;
            case("dinner"):
                System.out.println("Dinner menu!");
                break;
            default:
                System.out.println("Not a valid timing");
                break;
        }

    }
}
