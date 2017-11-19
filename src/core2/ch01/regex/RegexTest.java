package core2.ch01.regex;

import java.util.*;
import java.util.regex.*;

/**
 * Created by MKD on 2017/11/19
 */
public class RegexTest {
    public static void main(String[] args) throws PatternSyntaxException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pattern:");
        String patternString = in.nextLine();

        Pattern pattern = Pattern.compile(patternString);

        while (true){
            System.out.println("Enter String to match:");
            String input = in.nextLine();
            if (input == null && input.equals("")) return;
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()){
                System.out.println("Match");
                int g = matcher.groupCount();
                if (g > 0){
                    for (int i=0;i<input.length();i++){
                        //print any empty groups
                        for (int j=1;j<=g;j++){
                            if (i == matcher.start(j) && i ==matcher.end(j)){
                                System.out.println("()");
                            }
                        }
                        //print (for non-empty groups ending here
                        for (int j=1;j<=g;j++){
                            if (i == matcher.start(j) && i !=matcher.end(j)){
                                System.out.println("(");
                            }
                        }
                        //print ) for non-empty groups ending here
                        for (int j=1;j<=g;j++){
                            if (i + 1 != matcher.start(j) && i +1 ==matcher.end(j)){
                                System.out.println(")");
                            }
                        }
                    }
                }
                System.out.println();
            }
            else
                System.out.println("No match");
        }

    }
}
