package com.JavaLearn;

import java.util.Scanner;

public class exersice {
    public static void main(String[] args) {
        System.out.print("Enter a number:");

        //scanner class

        Scanner s=new Scanner(System.in);

        long n= s.nextInt();

         if (n%2==0)
             System.out.println("The number you have entered is even.....");

         //!within peranthesis is negating//checking if true or false//you can also write-if(n%2==1)//sout_=odd.

        else  {
             System.out.println("opps your number is likely to be odd");
         }
         if(!(n%2==0))
             System.out.println("The number you have entered is odd......");


    }
}
