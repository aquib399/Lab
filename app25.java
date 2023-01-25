//Establishing server 1
import java.io.*;
import java.net.*;

public class app25 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        ServerSocket ss = new ServerSocket(3020);
        Socket s = ss.accept();
        System.out.println("connection established");
        OutputStream obj = s.getOutputStream();
        PrintStream ps = new PrintStream(obj);
        System.out.print("Enter your message : ");
        str = br.readLine();
        ps.println(str);
        br.close();
        ps.close();
        ss.close();
        s.close();
    }

}