package AprilTest;

import java.util.Scanner;

public class LengthMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] myArray = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = sc.nextInt();
        }

        int arrayLength = myArray.length;

        System.out.println("The length of the array is " + arrayLength);
    }
}
