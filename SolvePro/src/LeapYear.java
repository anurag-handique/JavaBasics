import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean favnumber = false;
        while (t-->2) {
            if (a == b) {
                favnumber = true;
            }
            a = a + c;
        }
        if (favnumber)
            System.out.println("YES");
        else
            System.out.println("NO");
    }


}
