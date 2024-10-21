package com.core.java.samples.generics;

public class NumberBox<N extends Number> { // 'N' bounded to Number
    private N number;

    public void setNumber(N number) {
        this.number = number;
    }

    public N getNumber() {
        return number;
    }
}

