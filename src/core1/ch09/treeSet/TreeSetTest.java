package core1.ch09.treeSet;

import java.util.*;

/**
 * Created by MKD on 2017/11/6
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescription = new TreeSet<>(
                Comparator.comparing(Item :: getDecription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
