package footballgame;

public class Fan implements Spectator {

    private String team ;

    public Fan(String team) {
        this.team = team;
    }

    public String reactToGoal(String scoringTeam) {

        if(scoringTeam == this.team){
            return "Yay!";
        } else {
            return "Boo!";
        }

    }
}
