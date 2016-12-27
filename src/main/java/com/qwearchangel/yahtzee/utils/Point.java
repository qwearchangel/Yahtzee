package com.qwearchangel.yahtzee.utils;

/**
 *
 * @author Filip Ferm
 */
public enum Point {
    ONES {
        @Override
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
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
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
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
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
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
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
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
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
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
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
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
        public int getPoint(String[]... dices) {
            return checkEquals(dices[0], 3);
        }
    },
    FOUR_OF_A_KIND {
        @Override
        public int getPoint(String[]... dices) {
            return checkEquals(dices[0], 4);
        }
    },
    FULL_HOUSE {
        @Override
        public int getPoint(String[]... dices) {
            return 25;
        }
    },
    SMALL_STRIGHT {
        @Override
        public int getPoint(String[]... dices) {
            return 30;
        }
    },
    LARGE_STRIGHT {
        @Override
        public int getPoint(String[]... dices) {
            return 40;
        }
    },
    YAHTZEE {
        @Override
        public int getPoint(String[]... dices) {
            return 50;
        }
    },
    CHANCE {
        @Override
        public int getPoint(String[]... dices) {
            int sum = 0;
            for (String dice : dices[0]) {
                sum += Integer.parseInt(dice);
            }
            return sum;
        }
    };

    private static int checkEquals(String[] dices, int numberOfEquals) {
        int sum = 0;
        for (String dice : dices) {
            int equalCount = 0;

            for (String dice2 : dices) {
                
                if (dice.equals(dice2)) {
                    equalCount++;
                }

                if (equalCount == numberOfEquals) {
                    sum = Integer.parseInt(dice) * numberOfEquals;
                }
            }
        }

        return sum;
    }

    /**
     *
     * @param dices FULL_HOUSE, SMALL_STRIGHT, LARGE_STRIGHT and YAHTZEE is the
     * only ones that --DON'T-- need a String[]
     * @return
     */
    public abstract int getPoint(String[]... dices);
}
