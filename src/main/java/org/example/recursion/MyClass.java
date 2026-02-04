package org.example.recursion;

public class MyClass {
    //how to calculate factoria
    //N! = N x (N - 1) x (N - 2) x ... x 2 x 1
    //5! = 5 x 4 x 3 x 2 x 1
    public static int facorial (int N) {
        if (N <= 1)
            return 1;
        else return (N * facorial(N - 1));
    }
    public static void main(String[] args) {
        System.out.println(facorial(5));
    }
}
