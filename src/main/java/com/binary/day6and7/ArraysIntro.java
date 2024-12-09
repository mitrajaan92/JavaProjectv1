package com.binary.day6and7;

public class ArraysIntro {
    public static void main(String[] args) {
//        Arrays:
//              dataType[] name = new dataType[size];
//              dataType[] name = {120,100,10,23};
//        Drawback of arrays: cannot change the size.
        int[] arr = {111,122,133,144,155,266,78,77};
        for(int i=0; i< arr.length;i++){
            System.out.println("index["+i+"] = "+arr[i]);
        }
        User[] users = new User[10];


    }
}
