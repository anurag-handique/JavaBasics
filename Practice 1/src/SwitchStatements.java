import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("undefined month");
        }

    }
}
