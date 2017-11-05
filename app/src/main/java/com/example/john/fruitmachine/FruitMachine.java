package com.example.john.fruitmachine;

import java.util.ArrayList;
import java.util.Collections;

import static android.media.CamcorderProfile.get;

/**
 * Created by John on 03/11/2017.
 */

public class FruitMachine {

    ArrayList<Symbol> symbols;
    ArrayList<Symbol> results;
    int funds;
    int slots;
    int cost;

    protected FruitMachine(int funds, int slots, int cost) {
        this.symbols = new ArrayList<>();
        this.results = new ArrayList<>();
        this.funds = funds;
        this.slots = slots;
        this.cost = cost;
    }

    public int getFunds() {
        return funds;
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    public ArrayList<Symbol> getResults() {
        return results;
    }

    public void payOut(int amount) {
        funds -= amount;
    }

    public void topUp(int amount) {
        funds += amount;
    }

    public String start() {
        populateSymbols();
        ArrayList<Symbol> thisSpin = spin();
        String results = displaySpin(thisSpin);
        return results + outcome(checkWin(thisSpin));
    }

    // put all symbols in array with more of the less valuable fruit
    public void populateSymbols() {
        for (Symbol symbol : Symbol.values()) {
            //for (int i = 0; i < symbol.getNumber(); i++) {
                symbols.add(symbol);
           // }
        }
    }

    // return a random symbol from array
    public Symbol getRandomSymbol() {
        Collections.shuffle(symbols);
        return symbols.get(0);
    }

    // depending on number of slots on machine, get random symbols
    public ArrayList<Symbol> spin() {
        for (int i = 0; i < slots; i++) {
            results.add(getRandomSymbol());
        }
        return results;
    }

    public String displaySpin(ArrayList<Symbol> spins) {
        String intro = "\nWelcome to the CodeClan slot machine";
        String first = "\nThe first roll is " + spins.get(0).getType();
        String next = "\nThe next roll is " + spins.get(1).getType();
        String last = "\nThe last roll is " + spins.get(2).getType();
        return intro + first + next + last;
    }

    public int checkWin(ArrayList<Symbol> spins) {
        Symbol check = spins.get(0);
        for (Symbol symbol : spins) {
            if (symbol != check) {
                return 0;
            }
        }
        return check.getValue();
    }

    public String outcome(int winnings) {
        if (winnings == 0) {
            return "\n\nBetter luck next time";
        }
        return "\n\nWinner!  You won £" + winnings + "!";
    }

}
