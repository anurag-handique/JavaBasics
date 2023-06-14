package com.anurag;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your fathers name:");
        String fathersName = input.nextLine();
        System.out.println("Your father name is: " + fathersName);

        System.out.println(  "Enter your fathers pancard account no-:");
        String panCard=input.nextLine();
        System.out.println("Your father is applicable for the loan amount of RS-35000 ONLY/- with pancard no- " + panCard);

        System.out.println("enter your bank details-");
        String bankDetails=input.nextLine();
        System.out.println("YOUR BANK ACCOUNT IS SUCCESSFULLY VERIFIED FOR THE CREDIT WITH AC NO/- " + bankDetails);

        System.out.println("Do you want to continue and PROCCED to our next step of verification");
        String  verification=input.nextLine();
        System.out.println("THANKS," + verification);

        System.out.println("Enter your phone number-");
        String phoneNumber=input.nextLine();
        System.out.println("+91-"+ phoneNumber);

        System.out.println("OTP sent to your mobile");
        String otp=input.nextLine();

        System.out.println("6digit code-"+otp);
        System.out.println("payment processed");
        System.out.println("thanks for choosing us your amount will be credited shortly");

        int press = 20;
        if (press < 18) {
            System.out.println("redirecting to home page");
        } else {
            System.out.println("your process is completed you can leave the site");
        }
    }
}
