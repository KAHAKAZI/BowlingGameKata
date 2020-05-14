package org.bmc.tdd;

public class BowlingGame {

    public int getScore(int first, int second) {
        return first + second;
    }


    public boolean isStrike(String input) {
        return "X".equals(input);
    }

}
