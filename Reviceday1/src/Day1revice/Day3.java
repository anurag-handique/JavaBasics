package Day1revice;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        if (a % 2 == 0)
            System.out.println("even number");
        else if (a % 2 == 1)
            System.out.println("odd number");
    }
}