package org.example.polymorphism;

public class MyClass {
    public static void main(String[] args) {
        Bank abc = new Bank_ABC(); //a reference of bank class is having a form of Bank_ABC that is polymorphism.
        Bank def = new Bank_DEF(); //a reference of bank class is having a form of Bank_DEF that is polymorphism.
        Bank xyz = new Bank_XYZ(); //a reference of bank class is having a form of Bank_XYZ that is polymorphism.

        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());
    }
}
