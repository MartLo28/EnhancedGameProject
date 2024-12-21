public class Game {
    private String name;
    private boolean isRunning;

    // Constructor
    public Game(String name) {
        this.name = name;
        this.isRunning = false;
    }

    // Getter for game name
    public String getName() {
        return name;
    }

    // Start the game
    public void startGame() {
        isRunning = true;
        System.out.println("Game " + name + " has started.");
    }

    // Stop the game
    public void stopGame() {
        isRunning = false;
        System.out.println("Game " + name + " has ended.");
    }

    // Check if the game is running
    public boolean isRunning() {
        return isRunning;
    }
}
