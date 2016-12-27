package com.qwearchangel.yahtzee;

import com.qwearchangel.yahtzee.api.YahtzeeApi;
import com.qwearchangel.yahtzee.utils.Point;
import java.util.Arrays;

/**
 *
 * @author Filip Ferm
 */
public class Main {

    // For manual testing. For now!
    public static void main(String[] args) {
        YahtzeeApi api = new YahtzeeApi();
        
        int va = Point.FULL_HOUSE.getPoint();
        System.out.println("full house: " + va);
        
        String[] d = api.GetDice();
        
        System.out.println(Arrays.toString(d));
        
        va = Point.ONES.getPoint(d);
        System.out.println("Sum of ones " + va);
        
        String[] array = {"1","4","4","2","4"};
        va = Point.THREE_OF_A_KIND.getPoint(array);
        
        System.out.println("sum of thee of a kind " + va);
    }
}
