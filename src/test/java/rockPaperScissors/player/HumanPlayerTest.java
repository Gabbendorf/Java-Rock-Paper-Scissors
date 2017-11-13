package rockPaperScissors.player;

import org.junit.Test;
import rockPaperScissors.language.English;
import rockPaperScissors.ui.DoubleUi;

import static org.junit.Assert.assertTrue;
import static rockPaperScissors.move.Move.PAPER;

public class HumanPlayerTest {

   @Test
   public void returnsMove() {
       DoubleUi doubleUi = new DoubleUi(null, null, new English());
       HumanPlayer humanPlayer = new HumanPlayer("Gabriella");

       assertTrue(humanPlayer.makeMove(doubleUi) == PAPER);
   }
}
