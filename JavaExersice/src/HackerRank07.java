import java.util.Scanner;

public class HackerRank07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for (int run = 1; run <= t; run++) {//this loop is nor n test cases.

            int n = sc.nextInt();//nTH prime number input place.

            int check = 0;
            int nthPrime = 2;
            while (check < n) {
                boolean primeNumber = true;
                for (int j = 2; j <= Math.sqrt(nthPrime); j++) {
                    if (nthPrime % j == 0) {//to check strict divisor.
                        primeNumber = false;
                        break;
                    }
                }
                if (primeNumber) {
                    check++;
                    if (check == n) {
                        System.out.println(nthPrime);
                        break;
                    }
                }
                nthPrime++;

            }


        }
    }
}