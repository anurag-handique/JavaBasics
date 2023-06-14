package WhileLoop;

import java.util.Scanner;

public class WhileLoopday1 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int i= s.nextInt();
         while (i<=10) {
             System.out.println("hello admin..." + i+"times");
             i++;
         }
    }
}
