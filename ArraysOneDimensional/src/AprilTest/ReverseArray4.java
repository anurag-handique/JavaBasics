package AprilTest;

public class ReverseArray4 {

//   1. Given an array reverse the array you can create a new array.
//   2. Rotate an array in place(Without creating a new array).

    static void reverse(int array[]) {
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
        int array[] = {1, 2, 3, 4, 5, 6, 7};

        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }

    }

}
