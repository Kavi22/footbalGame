package footballgame;

        import java.util.ArrayList;
        import java.util.List;

public class FootballGame {

    private List<Reporter> reporters;
    private List<Fan> fans;

    public FootballGame() {
        this.reporters = new ArrayList<>();
        this.fans = new ArrayList<>();
    }

    public void teamScored(String scoringTeam) {
        reporters.forEach((reporter) -> reporter.reactToGoal(scoringTeam));
        fans.forEach((fan) -> fan.reactToGoal(scoringTeam));
    }

    public void addReporter(Reporter reporter) {
        this.reporters.add(reporter);
    }

    public void addFan(Fan fan) {
        this.fans.add(fan);
    }


}
