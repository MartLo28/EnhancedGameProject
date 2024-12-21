public class Leaderboard {
    private LeaderboardDAO leaderboardDAO;

    public Leaderboard() {
        this.leaderboardDAO = new LeaderboardDAO();
    }

    // Adds a score to the database
    public void addScore(Player player, int score) {
        leaderboardDAO.addScore(player.getName(), score);
    }

    // Displays top scores from the database
    public void displayLeaderboard() {
        leaderboardDAO.displayTopScores(5); // Display top 5 scores
    }
}
