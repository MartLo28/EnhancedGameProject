import java.util.List;
import java.util.ArrayList;

public class Team {
    private String teamName;
    private List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Adds a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Returns the team's name
    public String getTeamName() {
        return teamName;
    }

    // Retrieves the list of players in the team
    public List<Player> getPlayers() {
        return players;
    }

    // Optional: Calculate total team score if needed, by summing each player’s score
}
