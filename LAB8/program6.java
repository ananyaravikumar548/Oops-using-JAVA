import java.net.*;
import java.io.*;

public class WebsiteInfo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Content Length: " + conn.getContentLength());
            System.out.println("Date: " + conn.getDate());

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            int count = 0;
            System.out.println("\n--- Webpage Content ---");
            while ((line = br.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
