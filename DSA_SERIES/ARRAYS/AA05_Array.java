package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
//INTRODUCTION TO ARRAY_LIST

import java.util.ArrayList;
public class AA05_Array {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>(10);
        // syntax:  Arraylist <Wrapper class> list = new ArrayList<>(initial capacity);
        a.add(2);
        a.add(5);
        a.add(8);
        a.add(10);
        a.set(2,90); //sets a new element in a particular index
        a.remove(0); //remove an element from the arraylist
        System.out.println(a);
    }
}
