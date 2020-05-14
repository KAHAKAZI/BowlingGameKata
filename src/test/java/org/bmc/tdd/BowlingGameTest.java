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
}