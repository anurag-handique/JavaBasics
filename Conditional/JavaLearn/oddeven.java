package com.JavaLearn;

import java.util.Scanner;


//od even using only if statement.

public class oddeven {
    public static void main(String[]args) {

        System.out.print("Enter a number:");

        Scanner c = new Scanner(System.in);

        int y = c.nextInt();

        if(y%2==0) {

            System.out.println("the number you have entered is even");

        }
        if(y%2==1) {
            System.out.println("the number is odd");
        }
    }
}
