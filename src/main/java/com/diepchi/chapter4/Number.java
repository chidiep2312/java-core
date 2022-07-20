package com.diepchi.chapter4;

public class Number {
    // Attributes
    private int a;
    private int b;

    // Constuctor
    public Number() {
    }

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Bussiness code
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a) {
        return a;
    }
}
