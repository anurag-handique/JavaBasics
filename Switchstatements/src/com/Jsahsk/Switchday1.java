package com.Jsahsk;

public class Switchday1 {

    //this is the switch statement related to the case problem if the default case is written in last, the default case will be the last statement printed,
    //here if integer given in the code is typed above the default case then the integer given and below the default case will be executed...
    public static void main(String[] args) {

        int j=30;

        switch (j) {
            case 10:
                System.out.println("less than 30");
            case 20:
                System.out.println("less than 30");
            case 30:
                System.out.println("this is equal to 30");
            case 40:
                System.out.println("greater than 30");
            default:
                System.out.println("none of the above");
        }
    }
}
