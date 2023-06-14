import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks obtained out of 100: ");
        int i = s.nextInt();

        if (i > 30 && i < 60)
            System.out.println("passed the exam");
        else if (i > 60 && i < 70)
            System.out.println("1st Division");
        else if (i > 70 && i < 80)
            System.out.println("Distinction");
        else if (i > 80 && i <= 100)
            System.out.println("letter Marks");
        else
            System.out.println("failed the exam");


    }
}
