package com.binary.day6and7;

public class StringIntro {
    public static void main(String[] args) {
//        Java memory:
//          1- Heap memory: java objects are stored in heap memory, which us a portion of java memory dedicated to storing objects and arrays.
//              - Heap memory is shared among all threads in JVM.
//          2- Stack memory: Java uses stack memory to store local variables and method call information.
//              - each thread in JVM has its own stack, which is used for methods call and local variables.
//        -> JDK vs JVM vs JRE:
//          - JDK (java development kit): JDK has two part: 1- JRE 2- compiler, debugger and other development tools
//          - JRE (java runtime enviroment): has two part: 1- JVM  2-libraries and compiled classes
//          - JVM (java virtual machine): has two part: Heap and stack memories.
//        String: java created special memory location in Heap.
//              - String is a datatype that contain collection of characters.
//              - String are Immutable: once the string is created, its value cannot be changed. (pw and hackers)
//              -
//        Mutable String classes:
//              - allows modification for string without creating a new one
//              - both have the same functionality,but they differ in terms of thread safety.
//          1- StringBuilder:it is not thread safe, dont use in multi thread  enviroment. it is more
//              efficient than StringBuffer (direct access)
//          2- StringBuffer: it is the thread safe. good for multi threading. less efficient (harder to access)
//
//
//

        String s1 ="hello"; // immutable: cannot be modified
        String s2 = "hello"; //stores in String literal pool
        String s3 = new String(); //stroes in heap memory
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1.contains("ll")); //check for sequence chars exists
        System.out.println(s1.endsWith("lo"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.indexOf("eb"));
        System.out.println(s1.substring(s1.indexOf("el"),s1.indexOf("el")+2 ));


        StringBuilder sb = new StringBuilder(); //mutable :can be modfied
        sb.append("hello");
        sb.append(7.8);
        System.out.println(sb);
        String st = sb.toString(); // "hello" -> 7.6 => toString() -> "hello7.6"
        sb.reverse();
        StringBuffer sb2 = new StringBuffer(); //mutable :can be modfied
        sb2.append("hello");
        sb2.append(7777.8);
        System.out.println(sb2);
        String st1 = sb2.toString();
        System.out.println(st1);

        String[] arrS = {"John", "Mary", "Lili", "Bob", "Kit"};

        for(int i = 0; i<arrS.length; i++){
            System.out.println(arrS[i]);
        }
        String[] arrS2 = new String[5];
        arrS2[0]= "lili1";
        arrS2[1]= "lil2i";
        arrS2[2]= "lili3";
        arrS2[3]= "lili4";
        arrS2[4]= "lili5";
        for(int i = 0; i<arrS2.length; i++){
            System.out.println(arrS2[i]);
        }
    }
}
