package footballgame;

import java.util.List;

public class FootballGame {

    private List<Spectator> spectators;

    public FootballGame(List<Spectator> spectators) {
        this.spectators = spectators;
    }

    public void teamScored(String scoringTeam) {
        spectators.forEach(spectator -> spectator.reactToGoal(scoringTeam));
    }

    public void addSpectators(Spectator spectator) {
        this.spectators.add(spectator);
    }

}
