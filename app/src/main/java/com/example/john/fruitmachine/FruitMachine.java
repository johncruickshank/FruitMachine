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

    public FruitMachine(int funds, int slots) {
        this.symbols = new ArrayList<>();
        this.results = new ArrayList<>();
        this.funds = funds;
        this.slots = slots;
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

    public void populateSymbols() {
        for (Symbol symbol : Symbol.values()) {
            symbols.add(symbol);
        }
    }

    public ArrayList<Symbol> spin() {
        for (int i = 0; i < slots; i++) {
            Collections.shuffle(symbols);
            results.add(symbols.get(0));
        }
        return results;
    }

    public boolean checkWin() {
        Symbol check = results.get(0);
        for (Symbol symbol : results) {
            if (symbol != check) {
                return false;
            }
        }
        return true;
    }

}
