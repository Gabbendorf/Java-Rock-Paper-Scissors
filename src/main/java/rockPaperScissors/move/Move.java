package rockPaperScissors.move;

import rockPaperScissors.game.Result;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static rockPaperScissors.game.Result.*;

public enum Move {

    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    public String name;

    public Result playAgainst(Move opponentMove) {
        if(this == opponentMove) {
            return DRAW;
        } else if (this == ROCK) {
            if(opponentMove == PAPER) {
                return LOST;
            } else {
                return WON;
            }
        } else if (this == PAPER) {
            if(opponentMove == ROCK) {
                return WON;
            } else {
                return LOST;
            }
        } else {
            if(opponentMove == ROCK) {
                return LOST;
            } else {
                return WON;
            }
        }
    }

    Move(String name) {
        this.name = name;
    }

    static public List<String> possibleMoves() {
        return Arrays.asList(ROCK.name, PAPER.name, SCISSORS.name);
    }

    static public String randomMove() {
        List<String> possibleMoves = possibleMoves();
        return possibleMoves.get(new Random().nextInt(possibleMoves.size()));
    }
}
