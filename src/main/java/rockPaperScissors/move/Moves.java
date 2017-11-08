package rockPaperScissors.move;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Moves {

    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    public String name;

    Moves(String name) {
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
