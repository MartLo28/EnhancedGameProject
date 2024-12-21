public class Player {
    private String playerName;
    private int score;

    // Constructor
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
    }

    // Getter for player name
    public String getPlayerName() {
        return playerName;
    }

    // Getter for player score
    public int getScore() {
        return score;
    }

    // Update player's score
    public void updateScore(int points) {
        score += points;
        System.out.println(playerName + " has a new score of: " + score);
    }
}
