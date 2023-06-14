package ObjectOrientedPogrammingSystems;

public class Problem5 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfEvenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfEvenNumbers += numbers[i];
            }
        }
        System.out.println("The sum of even number is : " + sumOfEvenNumbers);
    }
}
