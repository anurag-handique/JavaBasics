import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while (t-- > 0) {

            a = a + c;

            if (a + b <= c && b - c == a+c)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
