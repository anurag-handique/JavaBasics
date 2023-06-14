package PrepbytesWeek1;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Day3 {
    public static void main(String args[]) {

        int N;
        double M;
        float ch;

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        N = sc.nextInt();
        M = sc.nextDouble();

        ch = sc.nextFloat();

        System.out.println(N + "$" + df.format(M) + "$" + ch);


    }
}