package ObjectOrientedPogrammingSystems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Started.................");
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("enter a number between 1 to 10: ");
        Scanner scanner = new Scanner(System.in);
        try {


            int searchElement = scanner.nextInt();

            int indexNumber = Arrays.binarySearch(numbers, searchElement);

            if (indexNumber >= 0) {
                System.out.println("The index number of " + searchElement + " is " + indexNumber + ".");
            } else
                System.out.println("Enter a number between 1 to 10");
            System.out.println("Terminated.....................");
        } catch (Exception e) {
            System.out.println("The number you entered is not valid !!!.....Try again!!");
        }
    }
}
