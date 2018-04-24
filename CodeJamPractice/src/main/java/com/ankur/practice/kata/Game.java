package com.ankur.practice.kata;

/*
/BowlingGame Score using TDD with 100% Coverage
 */
public class Game {

    int[] rolls = new int[21];
    int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0; // frame by frame score
        int frameIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike( frameIndex )) {
                score += rolls[frameIndex] + strikeBonus( frameIndex );
                frameIndex += 1;
            } else if (isSpare( frameIndex )) {
                score += frameScore( frameIndex ) + spareBonus( frameIndex );
                frameIndex += 2;
            } else {
                score += frameScore( frameIndex );
                frameIndex +=2;
            }
        }
        return score;
    }

    private int frameScore(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private boolean isSpare(int frameIndex) {
        return frameScore( frameIndex ) == 10;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

}
