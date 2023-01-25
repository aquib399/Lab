//To get IP address
import java.io.*;
import java.net.*;

public class app22 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ISR);
        System.out.println("Enter a website's URL : ");
        String url = br.readLine();
        try {
            InetAddress IP = InetAddress.getByName(url);
            System.out.println("IP : " + IP);
        } catch (UnknownHostException e) {
            System.out.println("Website not found");
        }
    }
}
