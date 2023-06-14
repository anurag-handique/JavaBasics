package com.JavaLearn;

import java.util.Scanner;
public class Iq1{

            public static void main(String[] args) {


                System.out.println("Welcome to test iq centre........answer the below question to proceed further.....");
                System.out.println(" Question- Is 7 greater than 6? ");

                Scanner s = new Scanner(System.in);

                System.out.print("Enter '1' if true and  '2' if false : ");
                String input = s.nextLine();
                if(input.equalsIgnoreCase("1")) {
                    System.out.println("yes its true you are right.....!!!!!");
                } else if (input.equalsIgnoreCase("2")) {
                    System.out.println("you are wrong");
                }else {
                    System.out.println("You should press '1' for 'yes' and  '2' for 'no' please try again......");
                }


    }
}
