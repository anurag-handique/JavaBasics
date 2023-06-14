package com.NesoAcademy;

import java.util.Scanner;
/*
in for loop the first statement is -initalisation 2nd is condition 3rd is change.Strlength-1 is used because the input will have two different phases.
 */

public class Exersice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();

        for (int i = 0; i <= str.length()-1;i++)
            System.out.print(str.charAt(i)+" ");
    }
}