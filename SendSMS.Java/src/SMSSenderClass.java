import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class SMSSenderClass {

    public static void main(String[] args) {

        try {
            String apiKey  = "apiKey=" + "";
            String message ="&message=" + "Gretings from ANURAG HANDIQUE! Have a nice day!";
            //String sender = "&sender" + "TxTLCL";
            String numbers = "&numbers" + "6003919873";


            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data =apiKey + numbers + message;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.getRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes(UTF-8));

            BufferedReader rd =new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer =new StringBuffer();
            String line;
            while((line = rd.readLine())) != null) {
                stringBuffer.append(line).append("\n");
            }
            System.out.println(stringBuffer.toString());
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
