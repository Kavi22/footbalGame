package footballgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    // when you define the type of something, go as high as you can - here a fan is a type of Spectator.
    private Spectator reporter;
    private Spectator fan;

    private FootballGame footballGame;

    @BeforeEach
    public void setUp() throws Exception {
        reporter = mock(Reporter.class);
        fan = mock(Fan.class);
        ArrayList spectatorList = new ArrayList();
        spectatorList.add(fan);
        spectatorList.add(reporter);
        footballGame = new FootballGame(spectatorList);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(reporter).reactToGoal("Team A");
    }

    @Test
    public void reporterShouldReactToGoalIfHeArrivesLate() {
        Spectator reporter2 = mock(Spectator.class);
        footballGame.addSpectators(reporter2);
        footballGame.teamScored("Team A");
        verify(reporter2).reactToGoal("Team A");
    }

    @Test
    public void fanShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(fan).reactToGoal("Team A");
//        when(fan.reactToGoal("Team A")).thenReturn("yay");
    }

}
