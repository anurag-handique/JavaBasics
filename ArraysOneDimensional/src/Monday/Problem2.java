package Monday;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }



            int max = array[0];
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println(max + " ," + min);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter a valid input...");
            System.out.println(e.getMessage());

        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
