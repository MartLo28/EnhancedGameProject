public class SingletonTester {
    private static Game gameInstance;

    // Private constructor to prevent instantiation
    private SingletonTester() {}

    // Provides access to the single instance of Game
    public static Game getGameInstance() {
        if (gameInstance == null) {
            gameInstance = new Game();
        }
        return gameInstance;
    }
}
