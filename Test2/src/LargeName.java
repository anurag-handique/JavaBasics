public class LargeName {
    public static void main(String[] args) {
        String name = "";
        char[] chars = {'a', 'n', 'u', 'r', 'a', 'g', ' ', 'h', 'a', 'n', 'd', 'i', 'q', 'u', 'e'};
        for (int i = 0; i < 1000000; i++) {
            name += chars[i % chars.length];
        }
        System.out.println(name);
    }
}
