package playerTest;

import move.Paper;
import org.junit.Test;
import player.HumanPlayer;
import uiTest.DoubleUi;

import static org.junit.Assert.assertTrue;

public class HumanPlayerTest {

   @Test
   public void returnsMove() {
       HumanPlayer humanPlayer = new HumanPlayer("Gabriella", new DoubleUi(null, null));

       assertTrue(humanPlayer.makeMove() instanceof Paper);
   }
}
