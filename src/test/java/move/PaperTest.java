package move;

import game.Results;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaperTest {

    @Test
    public void winsAgainstRock() {
        Paper paper = new Paper("paper");

        String winnerValue = Results.WON.value;

        assertEquals(winnerValue, paper.playAgainst(new Rock("rock")));
    }

    @Test
    public void losesAgainstScissors() {
        Paper paper = new Paper("paper");

        String loserValue = Results.LOST.value;

        assertEquals(loserValue, paper.playAgainst(new Scissors("scissors")));
    }

    @Test
    public void isDrawAgainstPaper() {
        Paper paper = new Paper("paper");

        String drawValue = Results.DRAW.value;

        assertEquals(drawValue, paper.playAgainst(new Paper("paper")));
    }
}
