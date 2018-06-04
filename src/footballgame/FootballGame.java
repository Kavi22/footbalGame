package footballgame;

import java.util.List;

public class FootballGame {

    private List<Spectator> spectatorList;

    public FootballGame(List<Spectator> spectatorList) {
        this.spectatorList = spectatorList;
    }


    public void teamScored(String scoringTeam) {
        // implementation here
         spectatorList.forEach(spectator -> spectator.reactToGoal(scoringTeam));
    }


    public void addASpectator(Spectator reporter) {
        spectatorList.add(reporter);
    }
}
