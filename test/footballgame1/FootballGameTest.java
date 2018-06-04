package footballgame1;

import footballgame.Fan;
import footballgame.FootballGame;
import footballgame.Reporter;
import footballgame.Spectator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private Reporter reporter1;
    private FootballGame footballGame;
    private Fan fan1;

    @BeforeEach
    public void setUp() throws Exception {
        reporter1 = mock(Reporter.class);
        fan1 = mock(Fan.class);

        ArrayList<Spectator> spectatorArrayList = new ArrayList<>();
        spectatorArrayList.add(reporter1);
        spectatorArrayList.add(fan1);

        footballGame = new FootballGame(spectatorArrayList);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(reporter1).reactToGoal("Team A");
    }

    @Test
    public void shouldAddASpectatorToTheGame() {
        Reporter reporter2 = mock(Reporter.class);
        Fan fan2 = mock(Fan.class);
        footballGame.addASpectator(reporter2);
        footballGame.addASpectator(fan2);


        footballGame.teamScored("Team A");
        verify(reporter1).reactToGoal("Team A");
        verify(reporter2).reactToGoal("Team A");
        verify(fan1).reactToGoal("Team A");
        verify(fan2).reactToGoal("Team A");

    }

}
