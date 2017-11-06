package ch09.linkedList;

import java.util.*;

/**
 * Created by MKD on 2017/11/5
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //merge the word of b into a
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bInter = b.iterator();
        while (bInter.hasNext()){
            if (aIter.hasNext()) aIter.next();
            aIter.add(bInter.next());
        }
        System.out.println(a);

        //remove every second word from b
        bInter = b.iterator();
        while (bInter.hasNext()){
            bInter.next();//skip one element
            if (bInter.hasNext()){
                bInter.next();//skip that element
                bInter.remove();//remove that element
            }
        }
        System.out.println(b);

        //bulk operation: remove all word in b from a
        a.removeAll(b);
        System.out.println(a);
    }
}
