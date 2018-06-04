package footballgame;

public class Reporter implements Spectator {

    @Override
    public String reactToGoal(String team) {
        return "GOAL by " + team;
    }
}
