import java.util.Scanner;

public class Defination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * Take the array input from the user
         */
        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        /**
         * Take the elements input from the user
         */

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {

            System.out.print("Enter the element " + (i + 1) + " : ");
            /**
             * Insert the user input elements into the array
             */
            array[i] = scanner.nextInt();

        }
        System.out.println("The Elements of the array are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();

    }
}