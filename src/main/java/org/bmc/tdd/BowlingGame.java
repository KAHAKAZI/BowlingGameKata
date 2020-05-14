package org.bmc.tdd;

public class BowlingGame {

    public int getScore(int first, int second) {
        return first + second;
    }


    public boolean isStrike(String input) {
        return "X".equals(input);
    }

    public int getScoreForNow(String[] args, int index) {

        if ("X".equals(args[index])) {
            int value = getAsInt(args[index]) +
                    getAsInt(args[index + 1]) +
                    getAsInt(args[index + 2]);
            return value;
        }

        return -1;
    }

    public int getAsInt(String element){
        if ("X".equals(element)){
            return 10;
        }
        return Integer.parseInt(element);
    }

}
