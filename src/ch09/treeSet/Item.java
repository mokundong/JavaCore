package ch09.treeSet;

import java.util.*;

/**
 * Created by MKD on 2017/11/6
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    //Constructs an item
    public Item(String aDecription,int aPartNumber){
        description = aDecription;
        partNumber = aPartNumber;
    }
    //gets the decription of this item
    public String getDecription() {
        return description;
    }

    public String toString() {
        return "[descripion=" + description + ",partNumber=" + partNumber + "]";
    }

    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description,other.description) && partNumber == other.partNumber;
    }
    public int hashCode(){
        return Objects.hash(description,partNumber);
    }
    public int compareTo(Item other){
        int diff = Integer.compare(partNumber,other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}
