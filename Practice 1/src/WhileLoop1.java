import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while (i<1 || i>10){
            System.out.print("The entered number is not between 1 and 10. Try again: ");
            i = s.nextInt();

        }
        System.out.println("The number is between 1 and 10 Thanks!!!");
    }
}
