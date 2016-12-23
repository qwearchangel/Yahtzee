/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
