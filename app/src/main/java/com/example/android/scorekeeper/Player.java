package com.example.android.scorekeeper;

public class Player {
    private int score;
    private int warnings;

    Player() {
        score = 0;
        warnings = 0;
    }

    /**
     * Sets score directly.
     */
    public void setScore(int i) {
        score += i;
    }

    /**
     * Sets warnings directly.
     */
    public void setWarnings(int i) {
        warnings += i;
    }

    /**
     * Returns score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns warnings.
     */
    public int getWarnings() {
        return warnings;
    }
}