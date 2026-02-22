package org.sena.exception_example;

public class Test {
    public static void main(String[] args) {
        try {
            int x = Math.incrementExact(2147483647);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println();
        }
    }
}
