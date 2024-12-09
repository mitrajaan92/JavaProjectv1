package com.binary.day7;

import java.util.*;

public class QueueIntro {
    public static void main(String[] args) {
//        ---------------Queue----------------------------------
//        enqueue(); dequeue(); peek();
//        throws Exceptions------------------------return a value
//        -add()                                        offer() //same in terms of operation
//        -remove()                                     poll()
//        -element()                                    peek()

//        Queues are useful when a resources are shared with several consumers
//        Queues are important in cpu (central process unit) process schedule.
//        Threads are stored in Queues.
//        Queue<datatype> variableName = new ArrayList<>();
//        Queue<datatype> variableName = new LinkedList<>();
//        --------------Priority Queue----------------------
//        it will be sorted based on priority
//        we will assign priority to every single elements.
//        elements with high priority will be served before the ones with low priorities.
//        --------------Dequeue-----------------------------
//        -Double ended queues
//        -addFirst(); addLast(); removeFirst(); removeLast();
//        -we can use the deque to implement stack. Deque is not synchronized. (no lock, two users can access the sources at the same time)
//        ***synchronized -> locks and unlocks the data from accessing at the same time.
//        for the reason of synchronization, stack using vector(vector is synchronized) is slower but stack using deque is faster.

        Queue<String> queue2 = new LinkedList<>();
        queue2.add("blue");
        queue2.offer("green");
        Deque<String> stack = new ArrayDeque<>();




    }
}
