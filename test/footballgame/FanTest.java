package footballgame;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class FanTest {

    @Test
    public void shouldReactPositivelyWhenTeamAScores() {
        Fan fanOfA = new FanA();
        assertThat(fanOfA.reactToGoal("Team A"), Matchers.is("Yay!"));
    }

    @Test
    public void shouldReactNegativelyWhenTeamBScores() {
        Fan fanOfA = new FanA();
        assertThat(fanOfA.reactToGoal("Team B"), Matchers.is("Boo!"));
    }

    @Test
    public void shouldReactPositivelyWhenTeamBScores() {
        Fan fanOfB = new FanB();
        assertThat(fanOfB.reactToGoal("Team A"), Matchers.is("Boo!"));
    }

    @Test
    public void shouldReactNegativelyWhenTeamAScores() {
        Fan fanOfB = new FanB();
        assertThat(fanOfB.reactToGoal("Team B"), Matchers.is("Yay!"));
    }
}
