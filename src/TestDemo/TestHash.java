package TestDemo;

/**
 * Created by MKD on 2017/10/31
 */
public class TestHash {
    public static void main(String[] args) {
        String s = "ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("ok");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}
