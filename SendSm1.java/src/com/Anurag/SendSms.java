package com.Anurag;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

public class SendSms {

    public static void sendSms(String message,String number) {


        System.out.println(message);
        System.out.println(number);
        try {

             //important steps

            String apikey = "ZFF4lWZISgBPhRO19uHYABFqXD9hD96kbnJAkCDwA5lEgm1M34irSb4Az2eG";

            message = URLEncoder.encode(message, "UTF-8");
            String language="english";

            String route="q";

            String myUrl="https://www.fast2sms.com/dev/bulkV2?authorization="+apikey+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;

            //print myurl is to check

            System.out.println(myUrl);

            //sending url to java

            URL url=new URL(myUrl);

            HttpsURLConnection con=(HttpsURLConnection)url.openConnection();


            con.setRequestMethod("GET");

            con.setRequestProperty("User-Agent","Mozilla/5.0");
            con.setRequestProperty("cache-control","no-cache");

            System.out.println("wait...........");

            int code=con.getResponseCode();

            System.out.println("Response code :"+code);

            StringBuffer response=new StringBuffer();

            BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));


            while (true)
            {
                String line= br.readLine();

                if(line==null)
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


    public static void main(String[] args) {
        System.out.println("Program started.......");
        SendSms.sendSms("Hello Tilak chandra handique \n   your account endi"+ new Date().toLocaleString(), "6003919873");
    }
}