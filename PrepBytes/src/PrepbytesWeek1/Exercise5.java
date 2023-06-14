package PrepbytesWeek1;

import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i%2==1)
            System.out.println(i+" is an even number.");
        else
            System.out.println("odd");
    }
}
