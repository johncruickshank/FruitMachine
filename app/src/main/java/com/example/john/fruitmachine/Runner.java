package com.example.john.fruitmachine;

/**
 * Created by John on 04/11/2017.
 */

public class Runner {

    public static void main(String[] args) {
        FruitMachine fruitMachine = new FruitMachine(100, 3, 1);
        System.out.println(fruitMachine.start());
    }

    //notes

    // need to sort out the loop to get multiple symbols in array
    // want to respond to user input. while loop?
    // without user response, including user class pointless
    // need to figure out how to make responses for various num of slots

}
