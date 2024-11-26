package com.binary.day1;

public class LoopStatements {
    public static void main(String[] args) {
//        for, while, do-while
//        ex: print 39, 41, 43, ....150
//        print numbers that are divisible by 5
        for(int i=39; i<= 150; i+=2){
            if(i%5 == 0){
                System.out.println("Divisible by 5:  " + i);
            }
            else{
                System.out.println("Number "+i);
            }
        }
        int c = 39;
        while(c < 150){
            if(c%5 == 0){
                System.out.println("Divisible by 5:  " + c);
            }
            else{
                System.out.print(c+" ");
            }
            c+=2;
        }
        int d = 39;
        do{
            if(d%5 == 0){
                System.out.println(d +" Divisible by 5.");
            }
            else{
                System.out.print(d+" ");
            }
            d+=2;
        }while(d <150);
    }
}
