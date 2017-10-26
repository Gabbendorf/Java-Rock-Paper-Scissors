package move;

import game.Results;

public class Scissors implements Move {

    private String name;

    public Scissors(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName() == "paper") {
            return Results.WON.value;
        } else if (opponentMove.getName() == "rock"){
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}
