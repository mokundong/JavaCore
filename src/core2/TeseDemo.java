package core2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by MKD on 2017/11/13
 */
public class TeseDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("a.txt");
        String name = "name";
        double sa = 500;
        out.print(name);
        out.print(' ');
        out.print(sa);
        out.close();
    }
}
