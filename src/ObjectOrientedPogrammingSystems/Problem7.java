package ObjectOrientedPogrammingSystems;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i] + " ");
            }
        }


    }
}
