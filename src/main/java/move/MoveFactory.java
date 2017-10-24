package move;

public class MoveFactory {

    public Move newMove(String moveChosen) {
       if (moveChosen == "rock") {
           return new Rock(moveChosen);
       } else if (moveChosen == "paper"){
           return new Paper(moveChosen);
       } else {
           return new Scissors(moveChosen);
       }
    }
}
