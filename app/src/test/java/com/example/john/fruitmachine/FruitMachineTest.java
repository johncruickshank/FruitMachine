package com.example.john.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 03/11/2017.
 */

public class FruitMachineTest {

    FruitMachine fruitMachine;
    FruitMachine spyFruitMachine;

    @Before
    public void setUp() throws Exception {
        fruitMachine = new FruitMachine(100, 3, 1);
        spyFruitMachine = new FruitMachine(100, 3, 1);
    }

    @Test
    public void testCanPayOut() throws Exception {
        fruitMachine.payOut(10);
        assertEquals(90, fruitMachine.getFunds());
    }

    @Test
    public void testCanTopUp() throws Exception {
        fruitMachine.payOut(50);
        fruitMachine.topUp(100);
        assertEquals(150, fruitMachine.getFunds());
    }

    @Test
    public void testCanPopulateSymbolsArrayList() throws Exception {
        fruitMachine.populateSymbols();
        assertEquals(6, fruitMachine.getSymbols().size());
    }

    @Test
    public void testSpin() throws Exception {
        fruitMachine.populateSymbols();
        fruitMachine.spin();
        assertEquals(3, fruitMachine.getResults().size());
    }

    //test win true or false with mockito??
    @Test
    public void testCheckWin() throws Exception {
    }

}
