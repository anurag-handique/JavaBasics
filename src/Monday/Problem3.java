package Monday;

import java.util.Scanner;

public class Problem3 {
    static void reverse(int array[]) {

        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int rotate = array[i];
            array[i] = array[j];
            array[j] = rotate;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }


    }

}

