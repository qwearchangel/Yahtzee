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
    public void playerShouldSetAndReadAll() {
        Player player = new Player();
        player.setName("player");
        player.setOne(3);
        player.setTwo(6);
        player.setThree(9);
        player.setFour(12);
        player.setFive(15);
        player.setSix(18);
        player.setBonus();
        player.setThreeOfAKind(20);
        player.setFourOfAKind(24);
        player.setFullHouse(25);
        player.setSmallStright(40);
        player.setLargeStright(50);
        player.setYahtzee(50);
        player.setChance(20);
        
        assertEquals("player", player.getName());
        assertEquals(3, player.getOne());
        assertEquals(6, player.getTwo());
        assertEquals(9, player.getThree());
        assertEquals(12, player.getFour());
        assertEquals(15, player.getFive());
        assertEquals(18, player.getSix());
        assertEquals(35, player.getBonus());
        assertEquals(20, player.getThreeOfAKind());
        assertEquals(24, player.getFourOfAKind());
        assertEquals(25, player.getFullHouse());
        assertEquals(40, player.getSmallStright());
        assertEquals(50, player.getLargeStright());
        assertEquals(50, player.getYahtzee());
        assertEquals(20, player.getChance());
        assertEquals(327, player.getSum());
    }
    
    @Test
    public void PlayerShouldGetBonus() {
        Player p = new Player();
        p.setName("BonusPlayer");
        p.setOne(3);
        p.setTwo(6);
        p.setThree(9);
        p.setFour(12);
        p.setFive(15);
        p.setSix(18);
        p.setBonus();
        
        assertEquals(35, p.getBonus());
    }
}
