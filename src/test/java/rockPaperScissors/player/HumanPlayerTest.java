package rockPaperScissors.player;

import rockPaperScissors.move.Paper;
import org.junit.Test;
import rockPaperScissors.ui.DoubleUi;
import rockPaperScissors.language.English;

import static org.junit.Assert.assertTrue;

public class HumanPlayerTest {

   @Test
   public void returnsMove() {
       DoubleUi doubleUi = new DoubleUi(null, null, new English());
       HumanPlayer humanPlayer = new HumanPlayer("Gabriella");

       assertTrue(humanPlayer.makeMove(doubleUi) instanceof Paper);
   }
}
