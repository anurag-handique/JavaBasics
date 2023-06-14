package com.JavaLearn;

import java.util.Scanner;

public class Else {

    public static void main (String[]args) {

        System.out.print("Enter a number:");

        Scanner c = new Scanner(System.in);

        if( (c.nextInt() % 2)==0) {
            System.out.println("even");

        }
        else
            System.out.println("odd");
    }
}
