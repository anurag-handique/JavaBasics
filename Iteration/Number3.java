package Iteration;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int remainder;
            int count = 0;
            while (n >= 10) {
                remainder = n % 10;

                n /= 10;

                if (remainder == 5)
                    count++;

            }
            if (n != 5)
                System.out.println(count);
            else
                System.out.println(count + 1);
        }
    }
}
