/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qwearchangel.yahtzee.api;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filip Ferm
 */
public class YahtzeeApiTest {
    
    public YahtzeeApiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void rollDiceShouldNotBeEmpty() {
        YahtzeeApi api = new YahtzeeApi();
        String[] diceArray = api.GetDice();
        
        assertNotNull(diceArray[0]);
        assertNotNull(diceArray[1]);
        assertNotNull(diceArray[2]);
        assertNotNull(diceArray[3]);
        assertNotNull(diceArray[4]);
    }
    
    @Test
    public void rollDiceShouldBeHigherThenZero() {
        YahtzeeApi api = new YahtzeeApi();
        String[] diceArray = api.GetDice();
        
        assertTrue(Integer.parseInt(diceArray[0]) > 0);
        assertTrue(Integer.parseInt(diceArray[1]) > 0);
        assertTrue(Integer.parseInt(diceArray[2]) > 0);
        assertTrue(Integer.parseInt(diceArray[3]) > 0);
        assertTrue(Integer.parseInt(diceArray[4]) > 0);
    }
}
