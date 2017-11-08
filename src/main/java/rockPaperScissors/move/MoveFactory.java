package rockPaperScissors.move;

import static rockPaperScissors.move.Moves.*;

public class MoveFactory {

    public Move newMove(String moveChosen) {
       if (moveChosen.equals(ROCK.name)) {
           return new Rock(moveChosen);
       } else if (moveChosen.equals(PAPER.name)) {
           return new Paper(moveChosen);
       } else {
           return new Scissors(moveChosen);
       }
    }
}
