package rockPaperScissors.move;

import static rockPaperScissors.move.Move.*;

public class MoveFactory {

    public Move newMove(String moveChosen) {
       if (moveChosen.equals(ROCK.name)) {
           return Move.ROCK;
       } else if (moveChosen.equals(PAPER.name)) {
           return Move.PAPER;
       } else {
           return Move.SCISSORS;
       }
    }
}
