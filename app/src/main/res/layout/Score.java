public class Player {
    private int score;
    private int warnings;

    Score() {
        score = 0;
        warnings = 0;
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

    /**
     * Increments warnings by one.
     */
    public void incrementWarnings() {
        warnings++;
    }

    /**
     * Increments score by one.
     */
    public void scoreIncrement() {
        score++;
    }

    /**
     * Increments score by two.
     */
    public void scoreIncrementTwo() {
        score += 2;
    }

    /**
     * Increments score by three.
     */
    public void scoreIncrementThree() {
        score += 3;
    }
}