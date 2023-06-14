import java.util.Scanner;

public class MaxMin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        int min = n;

        while (true) {

            if (n < 0)
                break;

            if (n > max)
                max = n;

            if (n < min)
                min = n;


        }
        System.out.println("max=" + max + " min=" + min);
    }
}
