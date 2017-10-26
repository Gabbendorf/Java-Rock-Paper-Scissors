package move;

public class MoveFactory {

    public Move newMove(String moveChosen) {
       if (moveChosen.equals("rock")) {
           return new Rock(moveChosen);
       } else if (moveChosen.equals("paper")) {
           return new Paper(moveChosen);
       } else {
           return new Scissors(moveChosen);
       }
    }
}
