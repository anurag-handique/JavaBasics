package com.JavaLearn;

import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        System.out.println("type 1 for  yes and 2 for no");
        System.out.print("7 IS GREATER THAN 6:");

        Scanner y=new Scanner(System.in);

        int p = y.nextInt();

        if (p==1) {
            System.out.println("you are right");
        }
        if(p==2){
            System.out.println("opps you are wrong.........try again");
        }

        //the statements inside if(); is executed if the boolean-expression is true.
        //if false the statement will be skipped.



    }
}
