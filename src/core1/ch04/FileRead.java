package core1.ch04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr = new FileReader("D://work//a.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while(s != null){
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            fr.close();
        }catch (IOException e){
            System.out.println("File does not exist");
        }
    }
}
