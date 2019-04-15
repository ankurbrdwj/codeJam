package com.ankur.practice.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingKataTest {
    Game game;

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    public void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            game.roll( pins );
    }

    private void rollSpare() {
        game.roll( 5 );
        game.roll( 5 );
    }

    private void rollStrike() {
        game.roll( 10 );
    }

    @Test
    public void testGutterGame() {
        rollMany( 20, 0 );
        Assertions.assertEquals( 0, game.score() );
    }

    @Test
    public void testSecondGame() {
        rollMany( 20, 1 );
        Assertions.assertEquals( 20, game.score() );
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        game.roll( 5 );
        Assertions.assertEquals( 20, game.score() );

    }

    @Test
    public void testOneStrike() {
        rollStrike();
        game.roll( 3 );
        game.roll( 4 );
        rollMany( 16, 0 );
        Assertions.assertEquals( 24, game.score() );
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany( 12, 10 );
        Assertions.assertEquals( 300, game.score() );
    }

}

