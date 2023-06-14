package com.anurag;

import java.util.Scanner;

public class BankApp {

    // CONDITIONALS - if, if-else, else

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to SBI, please enter your Account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Your Account number is " + accountNumber);

        System.out.print("Please enter your 4 Digit ATM PIN: ");
        int pinNumber = sc.nextInt();

        if (pinNumber < 0) {
            System.out.println("PIN number should be positive");
        } else if (pinNumber <= 999) {
            System.out.println("PIN number should have at least 4 digits");
        } else if (pinNumber > 9999) {
            System.out.println("PIN number should be less than more than 4 digits");
        } else {
            System.out.println("PIN number generated: " + pinNumber);


        }
    }
}
