package AprilTest;

public class ArrayLength2 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "F", "Z", "QUAR", "gHJ", "PY", "asDF", "vvn", "iiK", "H", "ghfD", "GHZZ", "aDSH", "aDFS", "AJJSL"};
        int currentIndex = 0;

        while (true) {
            try {


                String element = array[currentIndex];
                currentIndex++;
            }catch (Exception e ){
                System.out.println("Array Length: "+currentIndex);
                break;
            }
        }


    }
}
