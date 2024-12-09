package com.binary.day7;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {
//        List:
//          1- ArrayList: ArrayList<Integer> arr = new ArrayList<>();
//                - for updating the element, a lot of shifting is happening.
//                Usage: preferred for data retrieving
//          2- LinkedList: LinkedList<Integer> arr = new LinkedList<>();
//                Usage: preferred when there are more updating and deletion in the app
//          3- Stack: its synchronized.
//                - LIFO: last in, first out
//                Usage: when LIFO logic is needed
//          4- Vector: it is synchronized ->in every operation, vector will lock the resource and unlock after the operation is done
//                - it's a legacy datatype
//----------ArrayList-------------------------------

//        Time complexity: Big O():
//          - Constant time => O of 1 : O(1)
//          - The size of array => O of n: O(n)
//        Space Complexity: Size of the array (n)

//        1- Search an element based on Index: O(1)
//        2- Search an element without index: O(n)
//        3- Insert at end: O(1)
//        4- Insert element at random position (shift): O(n)
//        5- Remove element at the end: O(1)
//        6- Remove element at random position (shift): O(n)
//----------LinkedList---------------------------------
//        Nodes: each node has two part:data and next (contains the next element address)
//              - Starting Node: HeadNode
//              - All nodes can be accessible through Head node

//        1- Search first item (Head Node) = O(1)
//        1- Search an element based on Index: O(n)
//        2- Search an element without index (random position): O(n)
//        3- Insert at end: O(n) // we always have to start at Head
//        4- Insert element at random position (shift): O(n) to find the location, the inserting itself is O(1)
//        5- Remove element at the end: O(n)
//        6- Remove element at random position (shift): O(n)

// Task: Create arraylist to store the names of different animals => five element
//        - create linkedlist to store different people heights => five elements

        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Mouse","Lion"));
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Donkey");
        animals.add("Tiger");
        animals.sort(null);
        System.out.println(animals);

        LinkedList<Double> heigths = new LinkedList<>();
        heigths.add(5.3);
        heigths.add(6.3);
        heigths.add(5.0);
        heigths.add(3.4);
        heigths.add(7.0);


        ListIterator<String> iterate = animals.listIterator();
        System.out.println("-----------------------------------------");
        System.out.println(heigths);

        while(iterate.hasNext()){
                iterate.add("Kitten");
            iterate.next();
        }
        System.out.println(animals);
//--------------Stack ------------------------------------------
//        pop(); //last element
//        push(); //addon top of the stack
//        peek(); //show the last/top element

        Stack<String > books = new Stack<>();
        books.push("war");
        books.push("rings");
        books.push("Lords");

        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books.peek());

//--------------Queue-------------------------------------------
//        FIFO:First in First out
//


    }
}
