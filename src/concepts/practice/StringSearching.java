package concepts.practice;

public class StringSearching {
    public static void main(String[] args) {
        /*
        indexOf(): searches first occourence of a character or subString.
        lastIndexOf():searches last occourence of a character or substring.
         */
        String str = "Hi how are You??";
        str.indexOf('a',3);
        str.lastIndexOf('h',5);
        System.out.println(str.indexOf('h',0));
        System.out.println(str.lastIndexOf('H',10));

    }

}
