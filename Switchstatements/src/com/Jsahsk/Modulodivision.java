package com.Jsahsk;
//LUCKY NUMBER TEST EXAMPLE 1-5350,3791

import java.util.Scanner;

public class Modulodivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welcome to Lucky Draw\nPlease enter a 4-digit number: ");
        int n = s.nextInt();
        if (!(n > 999 && n < 10000)) {
            System.out.println(n + " is not a 4-Digit number....please try again");
        }
        else {

            //if say ABCD is the number
            int firstDigit = n % 10; //we will get D.
            int secondDigit = (n / 10) % 10; //here ABC % 10=C.
            int thirdDigit = (n / 100) % 10; //AB%10=B.
            int fourthDigit = (n / 1000); //A%10=A.

            if (firstDigit + secondDigit == thirdDigit + fourthDigit)
                System.out.println(n+" is lucky number,go to our official website to redeem the code.....ASAP!!!!");
            else
                System.out.println("Not Lucky");

        }
    }
}
