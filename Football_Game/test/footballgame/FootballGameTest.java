package footballgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private Reporter reporterMock1;
    private Reporter reporterMock2;
    private Fan fanMock1;
    private Fan fanMock2;
    private FootballGame footballGame;

    @BeforeEach
    public void setUp() throws Exception {
        reporterMock1 = mock(Reporter.class);
        reporterMock2 = mock(Reporter.class);
        fanMock1 = mock(Fan.class);
        fanMock2 = mock(Fan.class);
        footballGame = new FootballGame();
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.addReporter(reporterMock1);
        footballGame.teamScored("Team A");
        verify(reporterMock1).reactToGoal("Team A");
    }

    @Test
    public void twoReportersShouldReactToAGoalWhenASecondReporterIsAdded() {
        footballGame.addReporter(reporterMock1);
        footballGame.addReporter(reporterMock2);
        footballGame.teamScored("Team A");
        verify(reporterMock1).reactToGoal("Team A");
        verify(reporterMock2).reactToGoal("Team A");

    }

    @Test
    public void twoFansShouldReactToAGoalWhenASecondFanIsAdded() {
        footballGame.addFan(fanMock1);
        footballGame.addFan(fanMock2);
        footballGame.teamScored("Team A");
        verify(fanMock1).reactToGoal("Team A");
        verify(fanMock2).reactToGoal("Team A");
    }



}


