import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WhoisLookup {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter domain name: ");
            String domain = sc.nextLine();

            Socket socket = new Socket("whois.internic.net", 43);
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            out.write((domain + "\r\n").getBytes());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
