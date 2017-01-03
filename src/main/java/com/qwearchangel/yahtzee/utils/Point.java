package com.qwearchangel.yahtzee.utils;

import java.util.Arrays;

/**
 *
 * @author Filip Ferm
 */
public enum Point {
    ONES {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                int value = Integer.parseInt(dice);
                if (value == 1) {
                    sum += value;
                }
            }
            return sum;
        }
    },
    TWOES {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                int value = Integer.parseInt(dice);
                if (value == 2) {
                    sum += value;
                }
            }
            return sum;
        }
    },
    THREES {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                int value = Integer.parseInt(dice);
                if (value == 3) {
                    sum += value;
                }
            }
            return sum;
        }
    },
    FOURS {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                int value = Integer.parseInt(dice);
                if (value == 4) {
                    sum += value;
                }
            }
            return sum;
        }
    },
    FIVES {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                int value = Integer.parseInt(dice);
                if (value == 5) {
                    sum += value;
                }
            }
            return sum;
        }
    },
    SIXES {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                int value = Integer.parseInt(dice);
                if (value == 6) {
                    sum += value;
                }
            }
            return sum;
        }
    },
    THREE_OF_A_KIND {
        @Override
        public int getPoint(String[] dices) {
            if (checkEquals(dices, 3)) {
                int sum = 0;
                for (String dice : dices) {
                    sum += Integer.parseInt(dice);
                }
                return sum;
            }
            return 0;
        }
    },
    FOUR_OF_A_KIND {
        @Override
        public int getPoint(String[] dices) {
            if (checkEquals(dices, 4)) {
                int sum = 0;
                for (String dice : dices) {
                    sum += Integer.parseInt(dice);
                }
                return sum;
            }
            return 0;
        }
    },
    FULL_HOUSE {
        @Override
        public int getPoint(String[] dices) {
            if((dices[0].equals(dices[1]) && dices[0].equals(dices[2]) ) 
                    && (dices[3].equals(dices[4]))) {
                return 25;
            }
            if((dices[0].equals(dices[1]) ) 
                    && (dices[2].equals(dices[3]) && dices[2].equals(dices[4]))) {
                return 25;
            }
            return 0;
        }
    },
    SMALL_STRAIGHT {
        @Override
        public int getPoint(String[] dices) {
            if (Arrays.asList(dices).contains("1")
                    && Arrays.asList(dices).contains("2")
                    && Arrays.asList(dices).contains("3")
                    && Arrays.asList(dices).contains("4")) {
                return 30;
            }
            if (Arrays.asList(dices).contains("2")
                    && Arrays.asList(dices).contains("3")
                    && Arrays.asList(dices).contains("4")
                    && Arrays.asList(dices).contains("5")) {
                return 30;
            }
            if (Arrays.asList(dices).contains("3")
                    && Arrays.asList(dices).contains("4")
                    && Arrays.asList(dices).contains("5")
                    && Arrays.asList(dices).contains("6")) {
                return 30;
            }
            return 0;
        }
    },
    LARGE_STRIGHT {
        @Override
        public int getPoint(String[] dices) {
            if (Arrays.asList(dices).contains("1")
                    && Arrays.asList(dices).contains("2")
                    && Arrays.asList(dices).contains("3")
                    && Arrays.asList(dices).contains("4")
                    && Arrays.asList(dices).contains("5")) {
                return 40;
            }
            if (Arrays.asList(dices).contains("2")
                    && Arrays.asList(dices).contains("3")
                    && Arrays.asList(dices).contains("4")
                    && Arrays.asList(dices).contains("5")
                    && Arrays.asList(dices).contains("6")) {
                return 40;
            }
            return 0;
        }
    },
    YAHTZEE {
        @Override
        public int getPoint(String[] dices) {
            if (checkEquals(dices, 5)) {
                return 50;
            }
            return 0;
        }
    },
    CHANCE {
        @Override
        public int getPoint(String[] dices) {
            int sum = 0;
            for (String dice : dices) {
                sum += Integer.parseInt(dice);
            }
            return sum;
        }
    };

    /**
     *
     * @param dices String[] containing dice nummbers
     * @param numberOfEquals
     * @return
     */
    private static boolean checkEquals(String[] dices, int numberOfEquals) {
        int sum = 0;
        for (String dice : dices) {
            int equalCount = 0;

            for (String dice2 : dices) {

                if (dice.equals(dice2)) {
                    equalCount++;
                }

                if (equalCount == numberOfEquals) {
                    return true;
                }
            }
        }

        return false;
    }

    public abstract int getPoint(String[] dices);
}
