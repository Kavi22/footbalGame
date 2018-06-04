package footballgame;

public class Reporter implements Spectator {

    public String reactToGoal(String scoringTeam) {
        return "GOAL by " + scoringTeam;
    }
}
