package footballgame;

public class Reporter implements Spectator {

    @Override
    public String reactToGoal(String scoringTeam) {
        return  "GOAL by " + scoringTeam;
    }

}
