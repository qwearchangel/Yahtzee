package com.qwearchangel.yahtzee.api;

import java.util.Random;

/**
 *
 * @author Filip Ferm
 */
class Dice {

    private String[] getDiceNumbers() {
        String[] diceArray = new String[5];
        for (int i = 0; i < 5; i++) {
            diceArray[i] = getRandomDiceNumber();
        }
        return diceArray;
    }
    
    private String getRandomDiceNumber() {
        Random r = new Random();
        int i = r.nextInt(6) + 1;
        return Integer.toString(i);
    }

    protected String[] roll() {
        return getDiceNumbers(); 
    }
}
