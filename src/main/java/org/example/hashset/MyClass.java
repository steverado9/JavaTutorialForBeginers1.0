package org.example.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class MyClass {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        //adding elements
        name.add("Mark");
        name.add("tom");
        name.add("jack");
        name.add("july");
        name.add("july");

        Iterator<String> itr = name.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
