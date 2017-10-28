package move;

public class MoveFactory {

    public Move newMove(String moveChosen) {
       if (moveChosen.equals(Moves.ROCK.name)) {
           return new Rock(moveChosen);
       } else if (moveChosen.equals(Moves.PAPER.name)) {
           return new Paper(moveChosen);
       } else {
           return new Scissors(moveChosen);
       }
    }
}
