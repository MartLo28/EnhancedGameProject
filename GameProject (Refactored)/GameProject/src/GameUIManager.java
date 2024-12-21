public class GameUIManager {

    // Shows the start screen message
    public void displayStartScreen() {
        System.out.println("Welcome to Draw It or Lose It!");
    }

    // Updates the display with the current score
    public void updateScoreDisplay(int score) {
        System.out.println("Current Score: " + score);
    }

    // Shows the end screen with the final score
    public void displayEndScreen(int finalScore) {
        System.out.println("Game Over! Final Score: " + finalScore);
    }
}
