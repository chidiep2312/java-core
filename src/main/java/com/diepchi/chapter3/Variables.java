package com.diepchi.chapter3;

public class Variables {
    private int a; // default: 0
    private boolean b; // false: false

    { // block code
      // Local variable
    }

    public static void doGet() {
        final int a = 0; // initialize
        System.out.println(a);
    }

    public static void doPost() {
    }

    public static void test(int x) {

    }

    public static void main(String[] args) {

        int a = 1;
        boolean b = false;

        // bieuthuc?bieuthuc2:bieuthuc3
        if (!b) {
            a++;
        } else {
            a--;
        }

        System.out.println(a);
    }
}
