

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tes {

    public static Integer nPlacePrimeNumber(Integer nPlace) {
        int count = 1; // we know that 2 is prime
        int candidate = 1;
        while (count <= nPlace) {
            candidate += 1;
            if (isPrime(candidate)) {
                count++;
            }
        }
        return candidate;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n < 4) {
            return true; // 2 and 3 are prime
        } else if (n % 2 == 0) {
            return false;
        } else if (n < 9) {
            return true; // we have already excluded 4, 6 and 8.
        } else if (n % 3 == 0) {
            return false;
        } else {
            int r = (int) Math.floor(Math.sqrt(n));
            int f = 5;
            while (f <= r) {
                if (n % f == 0) {
                    return false;
                }
                if (n % (f + 2) == 0) {
                    return false;
                }
                f += 6;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(nPlacePrimeNumber(n));
        }
    }
}
