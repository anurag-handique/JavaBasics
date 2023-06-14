package ObjectOrientedPogrammingSystems;

import java.util.InputMismatchException;
import java.util.Scanner;

class Day1 {
    public static void main(String[] args) {
        System.out.println("********************************************************************************************");
        System.out.println("Programme started.........");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        try {


            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                } else if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Minimum element in the array is: " + min);
            System.out.println("Maximum element in the array is: " + max);
            System.out.println("Terminated........");
            System.out.println("********************************************************************************************");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println(ioobe.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

