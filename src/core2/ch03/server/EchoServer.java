package core2.ch03.server;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Created by MKD on 2017/11/19
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        //establish server socket
        try (ServerSocket s = new ServerSocket(8189)){
            //wait for client connect
            try (Socket incoming = s.accept()){
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();

                try (Scanner in = new Scanner(inStream)){
                    PrintWriter out = new PrintWriter(outStream,true /* autoFlush */);

                    out.println("Hello ! Enter BYE to exit.");

                    //echo client input
                    boolean done = false;
                    while (!done && in.hasNextLine()){
                        String line = in.nextLine();
                        out.println("Echo: " + line);
                        if (line.trim().equals("BYE")){
                            done = true;
                        }
                    }
                }
            }
        }
    }
}
