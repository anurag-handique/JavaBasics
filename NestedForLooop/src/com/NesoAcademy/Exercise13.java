package com.NesoAcademy;

import java.util.Scanner;
/* INPUT-FOR N= N(+interger)-number of rows.
 *
 *   *       #CONDITION-(2*i-1)
 *     *-------this is i.(number of rows)(
 *********
 */

public class Exercise13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                if (i == n)
                    System.out.print("*");
                else if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();

        }


    }
}
