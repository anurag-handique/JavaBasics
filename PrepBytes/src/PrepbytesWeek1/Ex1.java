package PrepbytesWeek1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        float N = s.nextFloat();
        float M = s.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(N)+" "+df.format(M));
    }
}
