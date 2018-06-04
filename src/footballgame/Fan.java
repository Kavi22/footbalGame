package footballgame;

public abstract class Fan implements Spectator {

    private final String supportingTeam;

    Fan(String supportingTeam) {
        this.supportingTeam = supportingTeam;
    }

    public String reactToGoal(String scoringTeam) {
        if(scoringTeam.equals(supportingTeam)){
            return "Yay!";
        }

        return "Boo!";
    }
}
