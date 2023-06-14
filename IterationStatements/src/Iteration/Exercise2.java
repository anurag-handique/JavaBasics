package Iteration;

import java.util.*;
import java.io.*;

public class Exercise2 {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // Enter the no
            int rem;
            int count = 0;
            while (n >= 10) {
                rem = n % 10;
                n /= 10;
                if (rem == 5)
                    count++;
            }
            if (n != 5)
                System.out.println(count);
            else System.out.println(count + 1);
        }

    }
}