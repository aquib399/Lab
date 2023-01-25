//Establishing client 1
import java.io.*;
import java.net.*;

public class app26 {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3020);
        InputStream obj = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(obj));
        String str;
        while ((str = br.readLine()) != null)
            System.out.println(" from server :" + str);
        br.close();
        s.close();
    }
}