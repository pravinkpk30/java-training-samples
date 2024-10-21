package com.core.java.samples.generics;

public class Triple<X, Y, Z> { // 'X', 'Y', 'Z' for three types
    private X first;
    private Y second;
    private Z third;

    public Triple(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public X getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }

    public Z getThird() {
        return third;
    }
}

