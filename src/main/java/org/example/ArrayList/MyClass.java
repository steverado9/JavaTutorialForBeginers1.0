package org.example.ArrayList;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        int[] simpleArray = new int[5]; //a simple array

        ArrayList<Integer> myList = new ArrayList<Integer>(5); //the 5 is the initial size, not fixed size
        myList.add(1);
        myList.add(5);
        myList.add(3);
        myList.add(25);
        myList.add(93);
        myList.add(96);

        for(Integer x : myList)
            System.out.println(x);

        //to get the size of the array
        System.out.println("Size = " + myList.size());

        //remove the values of the array
        myList.remove(2);

        //changing the value of an array using the index
        myList.set(0, 100);

        for(Integer x : myList)
            System.out.println(x);
        System.out.println("Size = " + myList.size());


    }
}
