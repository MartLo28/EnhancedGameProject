public class ProgramDriver {
    public static void main(String[] args) {
        // Retrieve GameService instance (Singleton)
        GameService gameService = GameService.getInstance();

        // Create a new game
        Game game1 = new Game("Draw It or Lose It");
        gameService.addGame(game1);

        // Start the game
        game1.startGame();

        // Simulate other operations (like playing the game)

        // Stop the game
        game1.stopGame();

        // Shutdown the GameService after use
        gameService.shutdown();
    }
}
