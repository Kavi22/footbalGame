package footballgame;


import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FanTest {

    @Test
    public void shouldReactWithYayIfTeamAScores() {
        Fan fan = new Fan("Team A");

        assertThat(fan.reactToGoal("Team A"), is("Yay!"));
    }

    @Test
    public void shouldReactWithYayIfTeamBScores() {
        Fan fan = new Fan("Team B");

        assertThat(fan.reactToGoal("Team B"), is("Yay!"));
    }


}