package com.qwearchangel.yahtzee.model;

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
public class PlayerTest {
    
    public PlayerTest() {
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
    public void test() {
        
    }
    
    @Test
    public void playerShouldReadPoints() {
        Player player = new Player();
        player.setOne(5);
        player.setTwo(6);
        player.setThree(9);
        player.setFour(12);
        player.setFive(20);
        player.setSix(24);
        player.setBonus(50);
        player.setThreeOfAKind(20);
        player.setForOfAKind(24);
        player.setFullHouse(25);
        player.setSmallStright(40);
        player.setLargeStright(50);
        player.setYahtzee(50);
        player.setChance(20);
        
        assertEquals(5, player.getOne());
        assertEquals(6, player.getTwo());
        assertEquals(9, player.getThree());
        assertEquals(12, player.getFour());
        assertEquals(20, player.getFive());
        assertEquals(24, player.getSix());
        assertEquals(50, player.getBonus());
        assertEquals(20, player.getThreeOfAKind());
        assertEquals(24, player.getForOfAKind());
        assertEquals(25, player.getFullHouse());
        assertEquals(40, player.getSmallStright());
        assertEquals(50, player.getLargeStright());
        assertEquals(50, player.getYahtzee());
        assertEquals(20, player.getChance());
        assertEquals(355, player.getSum());
    }
}
