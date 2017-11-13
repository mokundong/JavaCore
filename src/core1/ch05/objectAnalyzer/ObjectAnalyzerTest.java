package core1.ch05.objectAnalyzer;

import java.util.ArrayList;

/**
 * Created by MKD on 2017/11/4
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i=1;i<5;i++){
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
