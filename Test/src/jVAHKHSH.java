import javax.crypto.spec.PSource;
import java.util.Scanner;

public class jVAHKHSH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
                for (int j = 1; j <= 2 * i - 1; j++)
                    if (n == i)
                        System.out.println("*");
                    else if (int j == 1 || j == 2 * n - 1)
                        System.out.println("*");
                    else
                        System.out.println(" ");
                System.out.println();


            }
        }
    }
}
