import java.io.IOException;

public class aNX {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("shutdown /s /t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
