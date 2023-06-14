package AprilTest;

import java.util.Scanner;
/*
This is a programme to take a user input first the size of the array then the
elements of the array then print the output.
 */

public class ArrayProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int array[] = new int[size];


        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i =0;i<array.length;i++)
        System.out.print(array[i]+" ");
    }
}