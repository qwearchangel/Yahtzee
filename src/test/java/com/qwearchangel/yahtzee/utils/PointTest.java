/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qwearchangel.yahtzee.utils;

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
public class PointTest {
    
    public PointTest() {
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
    public void OnesShouldGetRightResult() {
        String[] dices = {"1", "1", "1", "2", "2"};
        int result = Point.ONES.getPoint(dices);
        
        assertEquals(3, result);
    }
    
    @Test
    public void TwosShouldGetRightResult() {
        String[] dices = {"1", "1", "1", "2", "2"};
        int result = Point.TWOES.getPoint(dices);
        
        assertEquals(4, result);
    }
    
    @Test
    public void ThreesShouldGetRightResult() {
        String[] dices = {"3", "3", "3", "2", "2"};
        int result = Point.THREES.getPoint(dices);
        
        assertEquals(9, result);
    }
    
    @Test
    public void FoursShouldGetRightResult() {
        String[] dices = {"4", "4", "4", "2", "2"};
        int result = Point.FOURS.getPoint(dices);
        
        assertEquals(12, result);
    }
    
    @Test
    public void FivesShouldGetRightResult() {
        String[] dices = {"5", "5", "5", "2", "2"};
        int result = Point.FIVES.getPoint(dices);
        
        assertEquals(15, result);
    }
    
    @Test
    public void SixesShouldGetRightResult() {
        String[] dices = {"6", "6", "6", "2", "2"};
        int result = Point.SIXES.getPoint(dices);
        
        assertEquals(18, result);
    }
    
    @Test
    public void ThreeOfAKindShouldGetRightResult(){
        String[] dices = {"3","3","3","2","1"};
        
        int result = Point.THREE_OF_A_KIND.getPoint(dices);
        
        assertEquals(12, result);
    }
    
    @Test
    public void FourOfAKindShouldGetRightResult(){
        String[] dices = {"3","3","3","3","1"};
        
        int result = Point.FOUR_OF_A_KIND.getPoint(dices);
        
        assertEquals(13, result);
    }
    
    @Test
    public void FullHouseShouldGetRightResult(){
        String[] dices = {"3","3","3","4","4"};
        
        int result = Point.FULL_HOUSE.getPoint(dices);
        
        assertEquals(25, result);
    }
    
    @Test
    public void SmallStraightShouldGetRightResult(){
        String[] dices = {"1","2","3","4","1"};
        
        int result = Point.SMALL_STRAIGHT.getPoint(dices);
        
        assertEquals(30, result);
    }
    
    @Test
    public void LargeStraightShouldGetRightResult(){
        String[] dices = {"1","2","3","4","5"};
        
        int result = Point.LARGE_STRIGHT.getPoint(dices);
        
        assertEquals(40, result);
    }
    
    @Test
    public void YahtzeeShouldGetRightResult(){
        String[] dices = {"3","3","3","3","3"};
        
        int result = Point.YAHTZEE.getPoint(dices);
        
        assertEquals(50, result);
    }
    
    @Test
    public void ChanceShouldGetRightResult(){
        String[] dices = {"3","3","3","1","1"};
        
        int result = Point.CHANCE.getPoint(dices);
        
        assertEquals(11, result);
    }
}
