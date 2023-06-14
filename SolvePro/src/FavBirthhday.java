import java.util.Scanner;

public class FavBirthhday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean favnumber = false;

        while (t-- > 0) {
            if (a == b) {
                favnumber=true;

            }
            a = a + c;
        }
        if(favnumber)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
