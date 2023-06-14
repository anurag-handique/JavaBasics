import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

public class SendSms1 {

    public static  void SendSms1(String message,String number) {
        System.out.println(message);
        System.out.println(number);

        try {


            String apiKey = "ZFF4lWZISgBPhRO19uHYABFqXD9hD96kbnJAkCDwA5lEgm1M34irSb4Az2eG";

            message = URLEncoder.encode(message, "UTF-8");

            String language="english";
            String route="q";
            String myUrl="https://www.fast2sms.com/dev/bulkV2?authorization="+apiKey+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;

            System.out.println(myUrl);

            URL url=new URL(myUrl);

            HttpsURLConnection con = (HttpsURLConnection)url.openConnection();

            con.setRequestMethod("GET");

            con.setRequestProperty("User-Agent","Mozilla/5.0");

            con.setRequestProperty("cache-control","no-cache");

            System.out.println("wait...............................");
            
            int code=con.getResponseCode();

            System.out.println("Response code :"+code);
            
            StringBuffer response=new StringBuffer();

            BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            
                      while (true)
                      {
                          String  line= br.readLine();
                          
                          if (line==null)
                          {
                              break;
                          }
                          response.append(line);
                      }
            System.out.println(response);
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
            System.out.println("programme started........ please wait a moment");
        SendSms1.SendSms1("hello.....this message from java" + new Date().toLocaleString(), "6003919873");

    }

}
