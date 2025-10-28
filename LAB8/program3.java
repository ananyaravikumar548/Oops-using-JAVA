import java.net.*;
import java.util.Scanner;

public class FindIP {
    public static void main(String[] args) {
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            System.out.println("My System IP Address: " + myIP.getHostAddress());

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter domain name: ");
            String domain = sc.nextLine();

            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for (InetAddress addr : addresses) {
                System.out.println(domain + " -> " + addr.getHostAddress());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
