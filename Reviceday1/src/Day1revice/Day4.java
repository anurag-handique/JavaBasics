package Day1revice;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //programme to find strict divisor

        System.out.println("enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                System.out.print(i + " ");//sum+= i;
     //   System.out.println(sum);
    }
}
