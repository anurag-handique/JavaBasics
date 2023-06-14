import java.util.Scanner;

public class PR3 {
    public static void main(String[] args) {
        /*if even eprint even
        if odd sout odd

         */
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
