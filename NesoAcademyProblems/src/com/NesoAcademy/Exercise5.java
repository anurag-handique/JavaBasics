/*  Conditions-
                  1. Will end the loop when the last entered value -ve number.
                  2. The main loop will not run if the first entered value is -ve.
                  3. Will run an infinite loop.
  */
package com.NesoAcademy;

import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number series: ");

        int n = sc.nextInt();
        int max = n;
        int min = n;

        while (true) {
            n = sc.nextInt();

            if (n < 0)
                break;
            if (n > max)
                max = n;
            if (n < min)
                min = n;


        }
        System.out.println("min= "+min+",max= "+max);

    }
}
