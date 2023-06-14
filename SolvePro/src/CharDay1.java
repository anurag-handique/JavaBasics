import java.util.Scanner;

public class CharDay1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'P' || ch == 'p')
            System.out.println("PrepBytes");
        else if (ch == 'Z' || ch == 'z')
            System.out.println("Zenith");
        else if (ch == 'E' || ch == 'e')
            System.out.println("Expert Coder");
        else
            System.out.println("Data Structure");


    }
}



