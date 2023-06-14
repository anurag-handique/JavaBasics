import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        /*
       | P or p 	- PrepBytes      	|
       | Z or z 	- Zenith         	|
       | E or e 	- Expert Coder   	|
        |   D or d 	- Data Structure
         */
        Scanner s = new Scanner(System.in);


        String p = s.nextLine();
        String z = s.nextLine();
        String e = s.nextLine();
        String d = s.nextLine();

        if(p==p)
            System.out.println("Prepbytes");
        if(z==z)
            System.out.println("Zenith");

    }
}
