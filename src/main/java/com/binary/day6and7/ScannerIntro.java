package com.binary.day6and7;

import java.util.Scanner;

public class ScannerIntro {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String username = null;
            String password = null;
            String loginUser = null;
            String loginPassword = null;
            int slectedOption = 0;
            boolean stop = false;
            User[] users = new User[10];
            int lastUserLocation =0;
            System.out.println("*******************  Welcome to our App  *******************  ");

            while(!stop){
                System.out.println("1. Register ");
                System.out.println("2. Login ");
                System.out.println("3. All users");
                System.out.println("4. Logout ");
                System.out.println("5. Exit");

                System.out.print("Please select one of the above options: ");
                slectedOption = scan.nextInt();
                scan.nextLine();

                if(slectedOption == 1){
//               ------------------------------------------------------------------
                    System.out.println("Please enter your username: ");
                    username = scan.nextLine();
                    System.out.println("Please enter your password: ");
                    password = scan.nextLine();
                    User theUser = new User(username,password);
                    System.out.println("User successfully Registered!");
                    users[lastUserLocation] = theUser;
                    lastUserLocation++;
                    // ------------------------------------------------------------------

                }else if(slectedOption == 2){
                    // ------------------------------------------------------------------
                    System.out.println("Please enter your username to login: ");
                    loginUser = scan.nextLine();
                    System.out.println("Please enter your password to login: ");
                    loginPassword = scan.nextLine();
                    for(int i=0; i<lastUserLocation; i++ ) {
                        if (users[i].getUsername().equals(loginUser) && users[i].getPassword().equals(loginPassword)) {
                            System.out.println("You are logged in!");
                        } else {
                            System.out.println("Your login details are incorrect!");
                        }
                    }
                    // ------------------------------------------------------------------
                } else if(slectedOption == 4){
                    // ------------------------------------------------------------------
                    loginUser = null;
                    loginPassword = null;
                    System.out.println("User successfully logged out!");
                    // ------------------------------------------------------------------
                }else if(slectedOption == 3) {
                    for (int i = 0; i < lastUserLocation; i++) {
                     //   System.out.println("User["+i+"]: Username: "+ users[i].getUsername() +" Password: "+users[i].getPassword());
                        System.out.println(users[i].toString());
                    }
                }
                else if(slectedOption == 5){
                    // ------------------------------------------------------------------
                    stop = true;
                    System.out.println("User successfully exited!");
                    // ------------------------------------------------------------------
                }
            }
    }
}
