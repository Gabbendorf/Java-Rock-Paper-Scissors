package rockPaperScissors.move;

import rockPaperScissors.game.Results;

import static rockPaperScissors.move.Moves.*;

public class Scissors implements Move {

    private String name;

    public Scissors(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName().equals(PAPER.name)) {
            return Results.WON.value;
        } else if (opponentMove.getName().equals(ROCK.name)){
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}
