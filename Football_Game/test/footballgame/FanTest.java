package footballgame;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FanTest {

    @Test
    public void shouldReactPositivelyWhenOwnTeamScores() {
        Fan testFanA = new Fan("Team A");
        assertThat(testFanA.reactToGoal("Team A"), is("Yay!"));

        Fan testFanB = new Fan("Team B");
        assertThat(testFanB.reactToGoal("Team B"), is("Yay!"));
    }

    @Test
    public void shouldReactNegativelyWhenOtherTeamScores() {
        Fan testFanA = new Fan("Team A");
        assertThat(testFanA.reactToGoal("Team B"), is("Boo!"));

        Fan testFanB = new Fan("Team B");
        assertThat(testFanB.reactToGoal("Team A"), is("Boo!"));
    }


}
