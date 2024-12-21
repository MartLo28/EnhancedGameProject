public class ScoreManager {
    private int score; // Holds the current score

    public ScoreManager() {
        this.score = 0;
    }

    // Returns the current score
    public int getScore() {
        return score;
    }

    // Adds points to the current score
    public void addPoints(int points) {
        score += points;
    }

    // Resets the score to zero
    public void resetScore() {
        score = 0;
    }
}
