package rockPaperScissors.move;

public interface Move {

    String playAgainst(Move opponentMove);

    String getName();
}