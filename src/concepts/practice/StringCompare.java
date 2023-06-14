package concepts.practice;

public class StringCompare {
    public static void main(String[] args) {

        String name1 = "tony";
        String name2 = "tony";

//        if (name1.compareTo(name2) == 0) {
//            System.out.println("Strings are equal");
//
//        } else {
//            System.out.println("Strings are not equal");
//        }
        if (name1 == name2) {
            //This is not a great to use in codding interwiew.
            //Should use .Compare to compare the String's.
            System.out.println("Strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }

    }
}
