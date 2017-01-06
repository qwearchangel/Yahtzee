package com.qwearchangel.yahtzee.model;

/**
 *
 * @author Filip Ferm
 */
public class Player {

    int one;
    int two;
    int three;
    int four;
    int five;
    int six;
    int bonus;
    int threeOfAKind;
    int fourOfAKind;
    int fullHouse;
    int smallStright;
    int largeStright;
    int yahtzee;
    int chance;

    public Player() {
    }

    public Player(
            int one, int two, int three, int four,
            int five, int six, int bonus, int threeOfAKind,
            int fourOfAKind, int fullHouse, int smallStright,
            int largeStright, int yahtzee, int chance) {

        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.bonus = bonus;
        this.threeOfAKind = threeOfAKind;
        this.fourOfAKind = fourOfAKind;
        this.fullHouse = fullHouse;
        this.smallStright = smallStright;
        this.largeStright = largeStright;
        this.yahtzee = yahtzee;
        this.chance = chance;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getThreeOfAKind() {
        return threeOfAKind;
    }

    public void setThreeOfAKind(int threeOfAKind) {
        this.threeOfAKind = threeOfAKind;
    }

    public int getForOfAKind() {
        return fourOfAKind;
    }

    public void setForOfAKind(int forOfAKind) {
        this.fourOfAKind = forOfAKind;
    }

    public int getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getSmallStright() {
        return smallStright;
    }

    public void setSmallStright(int smallStright) {
        this.smallStright = smallStright;
    }

    public int getLargeStright() {
        return largeStright;
    }

    public void setLargeStright(int largeStright) {
        this.largeStright = largeStright;
    }

    public int getYahtzee() {
        return yahtzee;
    }

    public void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getSum() {
        return this.one + this.two + this.three + this.four + this.five
                + this.six + this.bonus + this.threeOfAKind + this.fourOfAKind 
                + this.fullHouse + this.smallStright + this.largeStright
                + this.yahtzee + this.chance;
    }
}
