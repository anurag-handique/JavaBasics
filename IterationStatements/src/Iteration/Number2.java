
package Iteration;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder;
        int sum = 0;
        int lastDigit;

        while (n != 0) {
            sum =sum+ n % 10;
            n /= 10;
        }
        System.out.println(sum);


    }
}

