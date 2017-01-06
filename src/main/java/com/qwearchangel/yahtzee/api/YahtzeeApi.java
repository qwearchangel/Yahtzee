package com.qwearchangel.yahtzee.api;

/**
 *
 * @author Filip Ferm
 */
public class YahtzeeApi {
    
    private final Dice dice;
    
    
    public YahtzeeApi() {
        dice = new Dice();
    }
    
    public String[] GetDice() {
        return dice.roll();
    }
}
