package WhileLoop;

import java.util.Scanner;

public class Whileloopday2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number between 1 & 10: ");


        int i = s.nextInt();
        while (i<1|| i>10) {
            System.out.print(i + " is not between 1 and 10...try again: ");
            i = s.nextInt();
        }
        System.out.println(i+" is between 1 and 10.thanks!!!");
    }
}
