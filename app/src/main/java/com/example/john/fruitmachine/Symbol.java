package com.example.john.fruitmachine;

/**
 * Created by John on 03/11/2017.
 */

public enum Symbol {
    APPLE(1, 4, "apple"),
    BANANA(3, 4, "banana"),
    WATERMELON(5, 3, "watermelon"),
    GRAPES(10, 3, "grapes"),
    LEMON(15, 2, "lemon"),
    PINEAPPLE(25, 1, "pineapple");

    private int value;
    private int number;
    private String type;

    Symbol(int value, int number, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
