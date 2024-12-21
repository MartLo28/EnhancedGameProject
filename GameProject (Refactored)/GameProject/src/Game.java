import java.util.PriorityQueue;

public class Game {
    private ScoreManager scoreManager;
    private GameUIManager uiManager;
    private String name;
    private Leaderboard leaderboard; // New Leaderboard instance

    // Constructor with name parameter
    public Game(String name) {
        this.scoreManager = new ScoreManager();
        this.uiManager = new GameUIManager();
        this.name = name;
        this.leaderboard = new Leaderboard(); // Initialize the leaderboard
    }

    // Default constructor for compatibility if needed
    public Game() {
        this("Default Game");
    }

    // Returns the name of the game
    public String getName() {
        return name;
    }

    public void startGame() {
        resetGame();
        displayStart();
    }

    private void resetGame() {
        scoreManager.resetScore();
    }

    private void displayStart() {
        uiManager.displayStartScreen();
    }

    public void updateScore(int points) {
        scoreManager.addPoints(points);
        uiManager.updateScoreDisplay(scoreManager.getScore());
    }

    public void endGame(Player player) {
        leaderboard.addScore(player, scoreManager.getScore());
        uiManager.displayEndScreen(scoreManager.getScore());
        leaderboard.displayLeaderboard();
    }
}