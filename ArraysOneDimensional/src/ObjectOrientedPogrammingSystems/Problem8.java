package ObjectOrientedPogrammingSystems;


import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

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
                } else if (array[i] < min) {
                    min = array[i];

                }
            }
            System.out.println(max);
            System.out.println(min);

        }
    }
}





