package ObjectOrientedPogrammingSystems;

public class Problem3 {
    public static void main(String[] args) {

        int numbers[] = new int[100];//array is created of size 100.(Not initalised)

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
            if ((i + 1) % 10 == 0) { //to check if it is a multiple of 10.
                System.out.println();
            }
        }
    }

}
