package com.binary.day6and7;

import java.util.Scanner;

public class ExceptionsIntro {
    public static void main(String[] args) {
//        Uses class: ATM and MinWithdrawAmountException classes
//        Exception are abnormal termination of a program
//        Types of Exception:
//          1- Checked exceptions:
//              -> can be checked during compile time, Extends the "Exception" class
//              -> methods that might throw a checked exception must declare it in their "throws" clause.
//              -> handle their exception using try/catch block
//              -> exception handling: inorder to stop the abnormal termination of program, we use exception handling.
//                  => try/catch and finally.
//        try{
//              problematic code
//          }catch(Exception e){
//            will deal with it accordingly
//          }finally{ //this will run no matter if exception happens or not
//              code
//          }

//          2- Unchecked exceptions:
//              -> it happens during the runtime -> JVM throws the exceptions
//              -> extends RuntimeException class
//              -> methods that might throw an unchecked exception, no need to declare it in their "throws" clause
//              -> caught explicitly
//          Exception Hierarchy:
//              - Throwable -> Main class
//              - Exception
//              - RuntimeException
//              - IOException
//              - SQLException
//              - ArrayIndexOutOfBoundException
//              - StringIndexOutOfBoundException
//        Ways to print an exception
//          - printStackTrace(): ExceptionClassName, message, location of Exception
//          - getMessage() : message
//          - directly print the exception: ExceptionClassName, message

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter integer B: ");
        int b = scanner.nextInt();
        try {
            System.out.println("A/B = " + a / b);
        } catch (Exception e) {
            System.out.println(e); //directly print the exception: ExceptionClassName, message
            System.out.println(e.getMessage()); //getMessage() : message
            e.printStackTrace(); //printStackTrace(): ExceptionClassName, message, location of Exception
        }
        ATM atm = new ATM();
        try {
            atm.withdraw(10); // gets error bcuz this method thorws exception
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        }catch(MinWithdrawException | MaxWithdrawException e2){
            System.out.println( e2);
        }

        try {
            atm.withdraw(500); // gets error bcuz this method thorws exception
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Always Welcome...! ");
        }


    }
}
