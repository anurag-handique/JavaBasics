
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Nth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(new Test().prime(n));
        }
    }
}

class Test {
    public int prime(int n) {
        int count = 0;
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
            }
            if (count == n) {
                break;
            }
            num++;
        }
        return num;
    }

    public boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if (n % 2 == 0) {
            return false;
        } else {
            int count = 0;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    count++;
                }
            }
            return count == 0;
        }
    }
}
