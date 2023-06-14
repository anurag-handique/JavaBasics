package ObjectOrientedPogrammingSystems;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase-- > 0) {

            int size = sc.nextInt();
            int array[] = new int[size];


            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();

            }
            int minrent = array[0];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minrent) {
                    minrent = array[i];
                    index = i;
                }

            }
            System.out.println(index);

        }


    }
}
