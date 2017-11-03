package com.example.john.fruitmachine;

/**
 * Created by John on 03/11/2017.
 */

public enum Symbol {
    APPLE(1),
    BANANA(2),
    WATERMELON(3),
    GRAPES(4),
    LEMON(5),
    PINEAPPLE(6);

    private int value;

    Symbol(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
