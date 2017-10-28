package player;

import move.Paper;
import org.junit.Test;
import ui.DoubleUi;
import language.English;

import static org.junit.Assert.assertTrue;

public class HumanPlayerTest {

   @Test
   public void returnsMove() {
       DoubleUi doubleUi = new DoubleUi(null, null, new English());
       HumanPlayer humanPlayer = new HumanPlayer("Gabriella");

       assertTrue(humanPlayer.makeMove(doubleUi) instanceof Paper);
   }
}
