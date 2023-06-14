package ForLoop1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        for (i = 0; i <= 20; i++) {
            for (j = 0; i + j % 2 == 0; i++);
            System.out.println(i+j);
        }
    }
}