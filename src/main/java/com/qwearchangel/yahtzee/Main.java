/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qwearchangel.yahtzee;

import com.qwearchangel.yahtzee.api.YahtzeeApi;
import java.util.Arrays;

/**
 *
 * @author Filip Ferm
 */
public class Main {

    // For manual testing. For now!
    public static void main(String[] args) {
        YahtzeeApi api = new YahtzeeApi();
        for (int i = 0; i < 100; i++) {
            String[] diceArray = api.GetDice();
            System.out.println(Arrays.toString(diceArray));
        }

    }
}
