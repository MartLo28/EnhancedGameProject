import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getPlayerName() + " added to team " + teamName);
    }

    // Get team name
    public String getTeamName() {
        return teamName;
    }

    // Get list of players
    public List<Player> getPlayers() {
        return players;
    }

    // Calculate the total score for the team
    public int calculateTotalScore() {
        int totalScore = 0;
        for (Player player : players) {
            totalScore += player.getScore();
        }
        return totalScore;
    }
}
