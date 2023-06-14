package com.Jsahsk;

public class Switchday2 {
    public static void main(String[] args) {

        int k=40;
        switch(k) {

            case 60:

                System.out.println("hello");
            case 70:

                System.out.println("bye");
            case 40:
                System.out.println("hello7");//this is the given integer.
            default:
                System.out.println("none of the above");//this is the default case written under the case 40.
            case 50:
                System.out.println("this is optional case");//this is the case written under the default case and will be executed.
        }
    }
}
