import java.sql.*;

public class LeaderboardDAO {
    private static final String DB_URL = "jdbc:sqlite:leaderboard.db";

    // Initializes the database and creates the table if it doesn't exist
    public LeaderboardDAO() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS leaderboard (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    player_name TEXT NOT NULL,
                    score INTEGER NOT NULL
                )
            """;
            Statement stmt = conn.createStatement();
            stmt.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Inserts a new score into the database
    public void addScore(String playerName, int score) {
        String insertSQL = "INSERT INTO leaderboard (player_name, score) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, playerName);
            pstmt.setInt(2, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieves the top scores from the database
    public void displayTopScores(int limit) {
        String querySQL = "SELECT player_name, score FROM leaderboard ORDER BY score DESC LIMIT ?";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(querySQL)) {
            pstmt.setInt(1, limit);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\n=== Leaderboard ===");
            while (rs.next()) {
                System.out.println(rs.getString("player_name") + ": " + rs.getInt("score"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
