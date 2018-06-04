package footballgame;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReporterTest {

    @Test
    public void shouldReportWhichTeamScored() {
        Reporter reporter = new Reporter();
        assertThat(reporter.reactToGoal("Team A"), is("GOAL by Team A"));
        assertThat(reporter.reactToGoal("Team B"), is("GOAL by Team B"));
    }
}