package org.bmc.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {

    BowlingGame theGame = new BowlingGame();

    @Test
    public void shouldReturnScore(){
        Assertions.assertThat(theGame.getScore(1,3)).isEqualTo(4);
    }

    @Test
    public void shouldBeStrike(){
        Assertions.assertThat(theGame.isStrike("X")).isEqualTo(true);
    }

    @Test
    public void shouldReturn30For3Strikes(){
        String[] values = {"X", "X", "X"};
        int index = 0;
        Assertions.assertThat(theGame.getScoreForNow(values, index)).isEqualTo(30);
    }

    @Test
    public void shouldReturn2StrikesPlus3Rd(){
        String[] values = {"X", "X", "3", "4"};
        int index = 0;
        Assertions.assertThat(theGame.getScoreForNow(values, index)).isEqualTo(23);
    }

    @Test
    public void shouldReturn1StrikePlus2Next(){
        String[] values = {"X", "2", "3"};
        int index = 0;
        Assertions.assertThat(theGame.getScoreForNow(values, index)).isEqualTo(15);
    }
}