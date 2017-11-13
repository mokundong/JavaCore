package core1.ch09;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by MKD on 2017/11/5
 */
public class TestDemo {
    public static void main(String[] args) {
        String[] values = {"a","b","c"};
        HashSet<String> staff = new HashSet<>(Arrays.asList(values));
        System.out.println(staff);

        String[] value = staff.toArray(new String[staff.size()]);
        for (int i=0;i<staff.size();i++){
            System.out.print(value[i]);
        }


    }
}
