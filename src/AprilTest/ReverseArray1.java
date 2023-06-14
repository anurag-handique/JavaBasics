package AprilTest;


import java.util.Scanner;

public class ReverseArray1 {

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
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }
}