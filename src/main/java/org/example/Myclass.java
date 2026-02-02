package org.example;

public class Myclass {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};

        int index = 0;
        while(index < myArray.length) {
            System.out.println(myArray[index]);
            index++;
        }

        Student stu = new Student();
//        stu.name = "stephen"; //access the name attribute in student class cos the access modifier is default
        stu.setName("stephen");
        stu.getName();
    }
}
