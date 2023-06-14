package AprilTest;

import java.util.Scanner;

public class Array5 {
    /*

In the rotateArrayInPlace method , k = k % array.length is used to compute the number of times the array should be rotated based on the given value of k.

The % operator in Java is the modulus operator, which returns the remainder of dividing the first operand by the second operand. So k % array.length computes the remainder when k

is divided by the length of the array. This is done to ensure that the value of k is within the bounds of the array length.

For example, if k is greater than or equal to the length of the array, then rotating the array k times is equivalent to rotating the array k % array.length times. By taking the modulus
 of k with the length of the array, we ensure that the value of k is within the range of 0 to array.length - 1.
     */
    static void rotateArrayInPlace(int[] array, int k) {
        k = k % array.length;

        for (int i = 0; i < k; i++) {
            int rotate = array[array.length - 1];
            for (int j = 0; j < array.length; j++) {
                int temporaryArray = array[j];
                array[j] = rotate;
                rotate = temporaryArray;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        rotateArrayInPlace(array, k);
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
    /*
    If k is equal to 10 in the provided Java program, the output would be the same as if k were equal to 0, since k % array.length would evaluate to 0. This is because rotating the array 10 times is equivalent to
     rotating it 10 % array.length times, which is the same as rotating it 0 times. Therefore, the output would be the original array, in the same order as it was initialized: 1,2,3,4,5,6,7,8,9,10


     */
}
