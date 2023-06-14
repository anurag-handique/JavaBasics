package AprilTest;

public class ReverseArray {
    static void reverse(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {

            int rotate = array[i];
            array[i] = array[j];
            array[j] = rotate;
            i++;
            j--;
        }


    }

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        reverse(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


}