//To retrieve different parts of the URL
import java.io.*;
import java.net.*;

public class app23 {
    public static void main(String[] args) throws IOException {
        URL obj = new URL("https://www.facebook.com/index.html");
        System.out.println("Protocol : " + obj.getHost());
        System.out.println("Host : " + obj.getHost());
        System.out.println("File : " + obj.getFile());
        System.out.println("Port : " + obj.getPort());
        System.out.println("Path : " + obj.getPath());
        System.out.println("External form : " + obj.toExternalForm());
    }
}
