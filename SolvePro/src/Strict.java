import java.util.Scanner;

public class Strict {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int sum = 0;


        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                System.out.print(i+" ");
        //System.out.println(sum);
    }
}
