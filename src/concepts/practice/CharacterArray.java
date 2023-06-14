package concepts.practice;

class CharacterArray {
    static void extraction(String str, String str1) {


        char array[] = new char[3];
        str.getChars(0, 3, array, 0);
        System.out.println(array);


        char buff[] = str1.toCharArray();
        System.out.println(buff);

    }

    public static void main(String[] args) {
        String str = "Anurag";
        String str1 = "Handique";

        extraction(str, str1);


    }
}

