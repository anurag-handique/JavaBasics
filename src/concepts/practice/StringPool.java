package concepts.practice;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Anurag";
        String s2 = "Anurag";
        /*
        In java , there are heap memory where there is string pool to store string whenever we initialise
        a String using String constant or String Literals,But when new StringObject  is created it is stored
        in heap memory and irrespective of containg same string it will create a new String.

         */
        if (s1 == s2) {
            System.out.println("Equal");
        }
        System.out.println(s1);

    }
    class NewStringObject{
        public String newString(String s){
            String s1 = newString("Handique");


            return s1;
        }

    }
}
