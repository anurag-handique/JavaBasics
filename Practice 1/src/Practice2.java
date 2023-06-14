import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*if div by 3 print fizz
        if div by 5 print buzz
        if both fizzbuzz if ists not divisible print the number.
         */
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i % 3 == 0 && i % 5 == 0)
            System.out.println("fizzbuzz");

        else if (i % 5 == 0)
            System.out.println("buzz");

        else if (i % 3 == 0)
            System.out.println("fizz");


    }
}
