package footballgame;

public class Fan implements Spectator {

    private String supported_team;

    public Fan() {
        long result = Math.round(Math.random());
        if (result == 0) {
            this.supported_team = "Team A";
        } else {
            this.supported_team = "Team B";
        }
    }

    public Fan(String team) {
        this.supported_team = team;
    }


    public String reactToGoal(String supported_team) {
        if (supported_team == this.supported_team) {
            return "Yay!";
        } else {
            return "Boo!";
        }
    }
}
