public class aNU {
    public static void main(String[] args) {
        /*
        print 1 to 100 using for loop
        print 1 to 100 using while loop
        print 1 to 100 using do-while loop
        print 100 to 1 using for loop
        print 100 to 1 using while loop
        print 100 to 1 using do-while loop
        print even numbers from 1 to 100
         */
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}