package rockPaperScissors.move;

import rockPaperScissors.game.Results;

import static rockPaperScissors.move.Moves.*;

public class Rock implements Move {

    private String name;

    public Rock(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName().equals(SCISSORS.name)) {
            return Results.WON.value;
        } else if (opponentMove.getName().equals(PAPER.name)){
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}
