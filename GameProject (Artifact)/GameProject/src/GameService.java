import java.util.ArrayList;
import java.util.List;

public class GameService {
    private static GameService instance;
    private List<Game> games;

    // Private constructor for Singleton pattern
    private GameService() {
        games = new ArrayList<>();
    }

    // Static method to get the instance of GameService
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    // Method to add a new game
    public void addGame(Game game) {
        games.add(game);
        System.out.println("Game added: " + game.getName());
    }

    // Retrieve list of all games
    public List<Game> getGames() {
        return games;
    }

    // Simulate the shutdown process of the GameService
    public void shutdown() {
        System.out.println("Shutting down GameService...");
        games.clear();
        instance = null;  // Reset the instance on shutdown
    }
}
