package ObjectOrientedPogrammingSystems;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }

            int x = sc.nextInt();
            for (int i = 0; i < array.length; i++) {


                if (array[i] == x) {
                    System.out.println("x found in index : " + i);
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input......");
            System.out.println(e.getMessage());
        }
    }
}


