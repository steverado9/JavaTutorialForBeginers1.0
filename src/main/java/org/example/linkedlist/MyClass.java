package org.example.linkedlist;

import java.util.LinkedList;

public class MyClass {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        //adding data to the list
        name.add("patrik");
        name.add("mark");
        name.add("tom");
        name.add("john");
        name.addFirst("stephen");
        name.addLast("pelumi");


        for (String x : name)
            System.out.println(x);

        //remove data from the linked list
        name.removeLast();
        name.removeFirst();

        for (String x : name)
            System.out.println(x);
    }
}
