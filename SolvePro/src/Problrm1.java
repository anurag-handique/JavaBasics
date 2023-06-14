import java.util.Scanner;

public class Problrm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("enter a number: ");
            sum += sc.nextInt();

            if (sum > 100)
                break;

        }
        System.out.println("Done " + sum);
    }


}
