package core2.ch03.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by MKD on 2017/11/19
 */
public class SocketTest {
    public static void main(String[] args) throws IOException{
        try (Socket s = new Socket("time-A.timefreq.bldrdoc.gov",13)){
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);

            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
}
