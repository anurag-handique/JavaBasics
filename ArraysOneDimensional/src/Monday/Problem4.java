package Monday;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        int i = 0;

        System.out.println("Enter the array elements(type 'exit' when ends: ");

        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            array[i] = Integer.parseInt(input);
            i++;

        }
        System.out.println("Array Length: " + i);

    }
}
