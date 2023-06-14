import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = input.nextInt();
            int count = 0;
            int num = 2;
            while (count < n) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                    if (count == n) {
                        System.out.println(num);
                        break;
                    }
                }
                num++;
            }
        }
    }
}
